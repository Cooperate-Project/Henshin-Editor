/**
 * 
 */
package agg.gui.editor;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import javax.swing.SwingUtilities;

import agg.editor.impl.EdArc;
import agg.editor.impl.EdGraphObject;
import agg.editor.impl.EdNode;

/**
 * @author olga
 *
 */
public class GraphCanvasMouseMotionAdapter implements MouseMotionListener {

	private GraphCanvas canvas;
	
	public GraphCanvasMouseMotionAdapter(final GraphCanvas graphcanvas) {
		this.canvas = graphcanvas;
		this.canvas.addMouseMotionListener(this);
	}

	public void mouseMoved(MouseEvent e) {
		if (this.canvas.getGraphics() == null 
				|| this.canvas.getGraph() == null
				|| this.canvas.getGraph().getTypeSet() == null
				|| this.canvas.getGraph().getTypeSet().isEmpty()) {
			return;
		}
		if (this.canvas.isScrolling()) {
			final Point p = this.canvas.getPickedPoint();
			this.canvas.scrollGraph(p.x, p.y, e.getX(), e.getY());
			this.canvas.setPickedPoint(e.getX(), e.getY());
			return;
		}

//		if (this.canvas.getEditMode() == EditorConstants.ARC
//				&& this.canvas.isMagicEdgeSupportEnabled()
//				&& this.canvas.getSourceObject() != null
//				&& this.canvas.getGraph().getTypeSet().getSelectedArcType() != null
//				&& (e.getX() > 0) && (e.getY() > 0)) {
//			final Point p = this.canvas.getPickedPoint();
//			final Point dist = new Point(Math.abs(e.getX() - p.x), Math.abs(e.getY() - p.y));
//			if (!this.canvas.isMagicArc() && (dist.x > 2 || dist.y > 2)) {
//				this.canvas.startMagicArc(e.getX(), e.getY());
//				this.canvas.setMagicArc(true);
//				this.canvas.setToolTipText(null);
//			} 
//			else if (this.canvas.isMagicArc()) {
//				this.canvas.drawMagicArc((EdNode) this.canvas.getSourceObject(), e.getX(), e.getY());
//			}
//		} 
//		else 
		{
			final EdGraphObject go = this.canvas.getPickedObject(e.getX(), e.getY(), 
								this.canvas.getGraphics().getFontMetrics());						
			if (go != null) {
				this.canvas.setToolTipText(null);
				
				if (go.isArc() && go.isVisible() && this.canvas.isEdgeAnchorVisible()
						&& !((EdArc) go).getBasisArc().isInheritance() ) {
					this.canvas.repaint(); // TEST
					go.getArc().showMoveAnchor(this.canvas.getGraphics());
				}				
				
				if (this.canvas.getGraph().isTypeGraph()) {
					final String comment = go.getType().getBasisType()
							.getTextualComment();
					if (!comment.equals(""))
						this.canvas.setToolTipText("  " + comment + "  ");
				} 
				else if (go.getType().isIconable()) {
					String attrText = getAttrText(go);
					if (!"".equals(attrText)) {
						this.canvas.setToolTipText(attrText);
					}
				}
			}
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		if (this.canvas.getGraphics() == null
				|| this.canvas.getGraph() == null) {
			return;
		}
		
		if (this.canvas.isLeftAndRightPressed()) {
			if (this.canvas.getPickedObject() != null) {
				this.canvas.draggingOfObject(e);
			}
			else if (this.canvas.getGraph().isEditable()) {
				this.canvas.resizeSelectBox(e.getX(), e.getY());
			}
			return;
		}
		
		if (this.canvas.isScrolling()) {
			this.canvas.setScrollingByDragging(true);
			final Point p = this.canvas.getPickedPoint();
			this.canvas.scrollGraph(p.x, p.y, e.getX(), e.getY());
			this.canvas.setPickedPoint(e.getX(), e.getY());
			return;
		}
		
		if (SwingUtilities.isLeftMouseButton(e)) {
			if (this.canvas.getEditMode() == EditorConstants.DRAW) {
				if (this.canvas.canCreateNode()) 			
					this.canvas.canCreateNodeOfType(null, null, null);
			
				if (this.canvas.getGraph().isEditable())
					this.canvas.resizeSelectBox(e.getX(), e.getY());				
			}
			else if (this.canvas.getEditMode() == EditorConstants.ARC
					&& this.canvas.isMagicEdgeSupportEnabled()
//					&& this.canvas.getSourceObject() != null
					&& (e.getX() > 0) && (e.getY() > 0)) {				
				
				final Point p = this.canvas.getPickedPoint();
				final Point dist = new Point(Math.abs(e.getX() - p.x), Math.abs(e.getY() - p.y));
				if (!this.canvas.isMagicArc() && (dist.x > 2 || dist.y > 2)) {
					this.canvas.startMagicArc(e.getX(), e.getY());
					this.canvas.setMagicArc(true);
				} else if (this.canvas.isMagicArc()) {
					this.canvas.drawMagicArc((EdNode) this.canvas.getSourceObject(), e.getX(), e.getY());
				}		
			} 			
			else if (this.canvas.getPickedObject() == null) {
				this.canvas.resizeSelectBox(e.getX(), e.getY());								
			}
			else {
				this.canvas.draggingOfObject(e);
			}
		} 
		else
		if (SwingUtilities.isMiddleMouseButton(e)
				|| (!SwingUtilities.isRightMouseButton(e)
						&& (this.canvas.getEditMode() == EditorConstants.MOVE
								|| this.canvas.getEditMode() == EditorConstants.SELECT
								|| this.canvas.getEditMode() == EditorConstants.VIEW))) {
			
			if (this.canvas.getPickedObject() != null) {
				this.canvas.draggingOfObject(e);
			}
			else {
				this.canvas.resizeSelectBox(e.getX(), e.getY());
			}
		}
	}

	
	
	private String getAttrText(final EdGraphObject go) {
		String attrText = "";		

		final Vector<Vector<String>> attrs = go.getAttributes();			
		for (int i=0; i<attrs.size(); i++) {
			Vector<String> attr = attrs.get(i);
			for (int j=1; j<attr.size(); j++) {
				attrText = attrText.concat(attr.get(j));
				if (j==1)
					attrText = attrText.concat("=");
			}
			if (!"".equals(attrText) && (i<attrs.size()-1)) {
				attrText = attrText.concat("<br>");
			}
		}
			
		if (!"".equals(attrText)) {
			attrText = "<html><body>".concat(attrText);
			attrText = attrText.concat("</body></html>");
		}
		return attrText;
	}
	
	
}
