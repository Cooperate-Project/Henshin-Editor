package de.tub.tfs.henshin.tggeditor.editpolicies.graphical;



import java.util.List;
import java.util.Set;

import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;

import de.tub.tfs.henshin.tgg.GraphLayout;
import de.tub.tfs.henshin.tgg.NodeLayout;
import de.tub.tfs.henshin.tgg.TGG;
import de.tub.tfs.henshin.tggeditor.commands.create.CreateNodeCommand;
import de.tub.tfs.henshin.tggeditor.commands.move.MoveDividerCommand;
import de.tub.tfs.henshin.tggeditor.commands.move.MoveManyNodeObjectsCommand;
import de.tub.tfs.henshin.tggeditor.commands.move.MoveNodeObjectCommand;
import de.tub.tfs.henshin.tggeditor.editparts.graphical.DividerEditPart;
import de.tub.tfs.henshin.tggeditor.editparts.graphical.GraphEditPart;
import de.tub.tfs.henshin.tggeditor.editparts.graphical.NodeObjectEditPart;
import de.tub.tfs.henshin.tggeditor.editpolicies.TggNonResizableEditPolicy;
import de.tub.tfs.henshin.tggeditor.util.GraphUtil;
import de.tub.tfs.henshin.tggeditor.util.NodeUtil;
import de.tub.tfs.henshin.tggeditor.util.NodeTypes.NodeGraphType;




public class GraphXYLayoutEditPolicy extends XYLayoutEditPolicy implements EditPolicy {
	
	DividerEditPart div;
	int dview;
	private final static int MINIMAL_DIV_DISTANCE = 150;
	boolean failed;

	protected EditPolicy createChildEditPolicy(EditPart child) {
		return new TggNonResizableEditPolicy();
	}
	
	protected Command createChangeConstraintCommand(EditPart child,	Object constraint) {
		Rectangle bounds = ((FigureCanvas)child.getViewer().getControl()).getViewport().getBounds();
		Rectangle newBounds = (Rectangle) constraint;
		
		// this causes a lot of shaking scroll bars, thus, deactivated
/*		if ((newBounds.x < bounds.x || newBounds.y < bounds.y) || (newBounds.x  + newBounds.width > bounds.width || newBounds.y + newBounds.width> bounds.height)){
			((FigureCanvas)child.getViewer().getControl()).scrollSmoothTo(((Rectangle)constraint).x + ((Rectangle)constraint).width + 20, ((Rectangle)constraint).y + ((Rectangle)constraint).height + 20);
			((FigureCanvas)child.getViewer().getControl()).getViewport().repaint();
		}*/
		
		
		MoveNodeObjectCommand c = null;
		
		if(child instanceof NodeObjectEditPart) {
			Node node = ((NodeObjectEditPart) child).getCastedModel();
			if(newBounds.x != node.getX() || newBounds.y != node.getY()) {
				c = new MoveNodeObjectCommand(node,newBounds.x,newBounds.y);
			}
		}
		return c;
	}
	
	@Override
	protected Command getCreateCommand(CreateRequest request) {
		Object newObject = request.getNewObject();
		if (newObject instanceof Node){
			Graph graph = (Graph) getHost().getModel();
			Rectangle constraint = (Rectangle) getConstraintFor(request);
			Point location = new Point(constraint.x,constraint.y);
			NodeGraphType  nodeGraphType = GraphUtil.getNodeGraphTypeForXCoordinate(((GraphEditPart)this.getHost()),location.x);
			
			CreateNodeCommand c = new CreateNodeCommand((Node)newObject,graph,
					location, nodeGraphType);
			return c;
		}
		return null;
	}
	
	@Override
	protected Command getMoveChildrenCommand(Request request) {
		GraphEditPart gep = (GraphEditPart)this.getHost();
		
		dview = ((FigureCanvas)gep.getViewer().getControl()).getViewport().getClientArea().getLocation().x;
		ChangeBoundsRequest req = (ChangeBoundsRequest) request;
		List<?> editparts = req.getEditParts();
		if (!editparts.isEmpty()) {
			// move nodes
			if (editparts.get(0) instanceof NodeObjectEditPart) {
				// target component: add divider offset
				NodeObjectEditPart nep = (NodeObjectEditPart) req.getEditParts().get(0);
				Node node = nep.getCastedModel();
				TGG tgg = NodeUtil.getLayoutSystem((Graph)this.getHost().getModel());			
				if (NodeUtil.isTargetNode(tgg, node.getType())){
					int posX = req.getMoveDelta().x;
					DividerEditPart divCTEdPart =  ((GraphEditPart)this.getHost()).getDividerCTpart();
					GraphLayout divCT = divCTEdPart.getCastedModel();
					int offset = divCT.getDividerX();
					if (node.getX()+posX < offset)
					req.getMoveDelta().setX(posX+offset);
				}

				if (canMoveNode(req)) {
					CompoundCommand cc = new MoveManyNodeObjectsCommand(editparts, req);
					// check divider location
					div = null;
					MoveDividerCommand c = makeMoveDividerCommand(cc.getCommands(), req);
					if (c != null) {
						cc.add(c);
						if (div != null) {
							makeMoveNodeCommand(div, c.getX(), cc);
						}
					}
					else if (failed) {
						cc.dispose();
						cc = null;
					}
					return cc;
				}
			}
			// move divider
			else if (editparts.get(0) instanceof DividerEditPart) {
				CompoundCommand cc = new CompoundCommand();
				DividerEditPart divEdPart = (DividerEditPart)editparts.get(0);				
				if (divEdPart.getCastedModel().isIsSC()) {
					int reqX = req.getLocation().x + dview;
					DividerEditPart divCT = ((GraphEditPart)this.getHost()).getDividerCTpart();
					if ((divCT.getCastedModel().getDividerX() - reqX) >= MINIMAL_DIV_DISTANCE) {
//							&& (reqX < divCT.getCastedModel().getDividerX())) {
						MoveDividerCommand c = new MoveDividerCommand(
								divEdPart.getCastedModel(), 
								reqX, 
								divEdPart.getCastedModel().getMaxY());				
						cc.add(c);						
						// check nodes to move and add to cc
						makeMoveNodeCommand(divEdPart, c.getX(), cc);
					}
					else {
						MoveDividerCommand c = new MoveDividerCommand(
								divEdPart.getCastedModel(), 
								divCT.getCastedModel().getDividerX() - MINIMAL_DIV_DISTANCE, 
								divEdPart.getCastedModel().getMaxY());
						cc.add(c);
						// check nodes to move and add to cc
						makeMoveNodeCommand(divEdPart, c.getX(), cc);
					}
				}
				else { // divEdPart.getCastedModel().isIsCT()
					int reqX = req.getLocation().x + dview;
					DividerEditPart divSC = ((GraphEditPart)this.getHost()).getDividerSCpart();	
					if ((reqX - divSC.getCastedModel().getDividerX()) >= MINIMAL_DIV_DISTANCE) {
//							&& (reqX > divSC.getCastedModel().getDividerX())) {
						MoveDividerCommand c = new MoveDividerCommand(
								divEdPart.getCastedModel(), 
								reqX, 
								divEdPart.getCastedModel().getMaxY());			
						cc.add(c);
						// check nodes to move and add to cc
						makeMoveNodeCommand(divEdPart, c.getX(), cc);
					}
					else {
						MoveDividerCommand c = new MoveDividerCommand(
								divEdPart.getCastedModel(), 
								divSC.getCastedModel().getDividerX() + MINIMAL_DIV_DISTANCE, 
								divEdPart.getCastedModel().getMaxY());
						cc.add(c);
						// check nodes to move and add to cc
						makeMoveNodeCommand(divEdPart, c.getX(), cc);
					}
				}
				return cc;
			}
		}
		return null;		
	}

	private MoveDividerCommand makeMoveDividerCommand(
			List<?> commands, ChangeBoundsRequest req) {
		
		NodeObjectEditPart nodeEdPart = null;
		int maxX = 0;
		int maxW = 0;
		for (Object co : commands) {
			MoveNodeObjectCommand mnc = (MoveNodeObjectCommand) co;
			NodeObjectEditPart nep = this.getNodeEditPart(mnc.getNode());
			if (nodeEdPart == null) {
				nodeEdPart = nep;
				maxX = mnc.getX();
				maxW = nep.getFigure().getSize().width;
			}
			else if ((mnc.getX() + nep.getFigure().getSize().width) 
					> (maxX + maxW)) {
				nodeEdPart = nep;
				maxX = mnc.getX();
				maxW = nep.getFigure().getSize().width;
			}
		}
		// check dividerSC
		MoveDividerCommand c = makeMoveDividerSCCommand(
						nodeEdPart, maxX, maxW, 
						((GraphEditPart)this.getHost()).getDividerSCpart());
		div = (c != null)? ((GraphEditPart)this.getHost()).getDividerSCpart(): null;
		if (c == null) {
			// check dividerCT
			c = makeMoveDividerCTCommand(
						nodeEdPart, maxX, maxW, 
						((GraphEditPart)this.getHost()).getDividerCTpart());
			div = (c != null)? ((GraphEditPart)this.getHost()).getDividerCTpart(): null;
		}
		return c;
	}
	
	private MoveDividerCommand makeMoveDividerSCCommand(
			NodeObjectEditPart nodeEdPart, 
			int maxX, int maxW, 
			DividerEditPart divSCEdPart) {
			
		MoveDividerCommand c = null;
		TGG tgg = NodeUtil.getLayoutSystem((Graph)this.getHost().getModel());
		GraphLayout divSC = divSCEdPart.getCastedModel();
		GraphLayout divCT = ((GraphEditPart)this.getHost()).getDividerCTpart().getCastedModel();
		Node node = nodeEdPart.getCastedModel();
		int divSC_X = divSC.getDividerX();
		if (NodeUtil.isSourceNode(tgg, node.getType())) {
			int x = maxX + maxW;// + reqX;
			failed = !(x < (divCT.getDividerX()-MINIMAL_DIV_DISTANCE));
			if ((x > divSC_X) && !failed) {
				c = new MoveDividerCommand(
							divSCEdPart.getCastedModel(), 
							(x+5), divSC.getMaxY());
			}
		}
		else if (NodeUtil.isCorrespNode(tgg, node.getType())) {
			int x = maxX;
			failed = !(x > MINIMAL_DIV_DISTANCE);
			if ((x < divSC_X)  && !failed) {
				c = new MoveDividerCommand(
							divSCEdPart.getCastedModel(), 
							(x-5) , divSC.getMaxY());
			}
		}
		return c;
	}
	
	private MoveDividerCommand makeMoveDividerCTCommand(
			NodeObjectEditPart nodeEdPart, 
			int maxX, int maxW, 
			DividerEditPart divCTEdPart) {
				
		MoveDividerCommand c = null;
		TGG tgg = NodeUtil.getLayoutSystem((Graph)this.getHost().getModel());
		GraphLayout divCT = divCTEdPart.getCastedModel();
		GraphLayout divSC = ((GraphEditPart)this.getHost()).getDividerSCpart().getCastedModel();
		Node node = nodeEdPart.getCastedModel();
		int divCT_X = divCT.getDividerX();
		if (NodeUtil.isCorrespNode(tgg, node.getType())) {
			int x = maxX + maxW;
			if (x > divCT_X) {
				c = new MoveDividerCommand(
							divCTEdPart.getCastedModel(), 
							(x+5), divCTEdPart.getCastedModel().getMaxY());
			}
		}
		else if (NodeUtil.isTargetNode(tgg, node.getType())) {
			int x = maxX;
			failed = !(x > (divSC.getDividerX()+MINIMAL_DIV_DISTANCE));
			if ((x < divCT_X)
					&& !failed) {
				c = new MoveDividerCommand(
							divCTEdPart.getCastedModel(), 
							(x-5), divCTEdPart.getCastedModel().getMaxY());
			}
		}
		return c;
	}
	
	private CompoundCommand makeMoveNodeCommand(DividerEditPart dep, int x, CompoundCommand cc) {
		
		TGG tgg = NodeUtil.getLayoutSystem((Graph)this.getHost().getModel());
		Graph graph = dep.getCastedModel().getGraph();
		if (dep.getCastedModel().isIsSC()) {			
			Set<Node> set = NodeUtil.getNodes(tgg.getCorresp(),graph);
			if (set.size() > 0) {
				for (Node n: set) {
					if (n.getX() < x) {
						cc.add(new MoveNodeObjectCommand(n, x+5, n.getY()));							
					}
				}
			}
			set = NodeUtil.getNodes(tgg.getSource(),graph);
			for (Node n: set) {
				NodeObjectEditPart nodeEdPart = getNodeEditPart(n);
				if (nodeEdPart != null) {
					int w = nodeEdPart.getFigure().getSize().width;
					if (n.getX()+w > x) {					
						cc.add(new MoveNodeObjectCommand(n, (x-5 -w), n.getY()));							
					}
				}
			}
		}
		else {
			Set<Node> set = NodeUtil.getNodes(tgg.getTarget(),graph);
			if (set.size() > 0) {
				for (Node n: set) {
					if (n.getX() < x) {
						cc.add(new MoveNodeObjectCommand(n, (x+5), n.getY()));							
					}
				}
			}
			set = NodeUtil.getNodes(tgg.getCorresp(),graph);	
			for (Node n: set) {
				NodeObjectEditPart nodeEdPart = getNodeEditPart(n);
				if (nodeEdPart != null) {
					int w = nodeEdPart.getFigure().getSize().width;
					if (n.getX()+w > x) {
						cc.add(new MoveNodeObjectCommand(n, (x-5 -w), n.getY()));							
					}
				}
			}
		}
		return cc;
	}
	
	private boolean canMoveNode(ChangeBoundsRequest req) {
		TGG tgg = NodeUtil.getLayoutSystem((Graph)this.getHost().getModel());
		int reqX;

		NodeObjectEditPart nep = (NodeObjectEditPart) req.getEditParts().get(0);
		Node n = nep.getCastedModel();
		if (req.getMoveDelta()!=null) {
			// automatic layouter: getMoveDelta
			reqX = n.getX() + req.getMoveDelta().x + dview;
			if (NodeUtil.isTargetNode(tgg, n.getType())){
					return true;
			}
		}
		else 
			// request is not caused by automatic layouter, but manually
			reqX = req.getLocation().x + dview;
		
		// maxX is the maximal requested new X position
		int maxX = 0;
		// maxW is the maximal with under all nodes
		int maxW = 0;
		for (Object obj : req.getEditParts()) {
			if (nep == null) {
				nep = (NodeObjectEditPart) obj;
				maxX = nep.getCastedModel().getX();
				maxW = nep.getFigure().getSize().width;
			}
			else if ((nep.getCastedModel().getX() + nep.getFigure().getSize().width)  > (maxX + maxW)){
				nep = (NodeObjectEditPart) obj;
				maxX = nep.getCastedModel().getX();
				maxW = nep.getFigure().getSize().width;
			}
		}
		// NodeLayout nl = nep.getLayoutModel();
		int divSCx = ((GraphEditPart)this.getHost()).getDividerSCpart().getCastedModel().getDividerX();
		int divCTx = ((GraphEditPart)this.getHost()).getDividerCTpart().getCastedModel().getDividerX();
		int divDistance = divCTx - divSCx;
		if (NodeUtil.isSourceNode(tgg, n.getType())) {
			if ((divDistance > MINIMAL_DIV_DISTANCE) || (reqX + maxW*3/4) <= divSCx) return true;
		}
		else if (NodeUtil.isCorrespNode(tgg, n.getType())) {
			// node is right of source divider
			if (n.getX() > divSCx) {
				// new position is between source and target dividers
				if ((divSCx < reqX) && (reqX < divCTx)) 
					return true;
			}
		}
		else if (NodeUtil.isTargetNode(tgg, n.getType())) {
			if ((divDistance > MINIMAL_DIV_DISTANCE) || (reqX - maxW*3/4) >= divCTx) return true;
		}
		return false;
	}
	
	private NodeObjectEditPart getNodeEditPart(Node n) {
		GraphEditPart gep = (GraphEditPart) this.getHost();
		List<?> list = gep.getChildren();
		for (Object child : list) {
			if (child instanceof NodeObjectEditPart
					&& ((NodeObjectEditPart) child).getCastedModel() == n) {
				return (NodeObjectEditPart) child;
			}
		}
		return null;
	}
	

}