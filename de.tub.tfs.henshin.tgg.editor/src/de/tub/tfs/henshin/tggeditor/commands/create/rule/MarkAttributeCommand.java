package de.tub.tfs.henshin.tggeditor.commands.create.rule;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.gef.commands.CompoundCommand;

import de.tub.tfs.henshin.tgg.AttributeLayout;
import de.tub.tfs.henshin.tgg.EdgeLayout;
import de.tub.tfs.henshin.tgg.NodeLayout;
import de.tub.tfs.henshin.tggeditor.util.AttributeUtil;
import de.tub.tfs.henshin.tggeditor.util.EdgeUtil;
import de.tub.tfs.henshin.tggeditor.util.NodeUtil;
import de.tub.tfs.henshin.tggeditor.util.RuleUtil;
import de.tub.tfs.muvitor.commands.SimpleDeleteEObjectCommand;

/**
 * The class MarkAttributeCommand can mark an attribute in a rule as new or not new. It makes
 * all the needed changes in the model of the rule and in the tgg layouts.
 * When executed it either deletes the lhs attribute or it creates
 * a new lhs attribute. Also the containing node is handled.
 */
public class MarkAttributeCommand extends CompoundCommand {

	/**
	 * the rhs attribute
	 */
	private Attribute rhsAttribute;

	/**
	 * the constructor 
	 * @param rhsAttribute the rhs attribute
	 */
	public MarkAttributeCommand(Attribute rhsAttribute) {
		this.rhsAttribute = rhsAttribute;
		
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.CompoundCommand#execute()
	 */
	@Override
	public void execute() {
		Node rhsNode=rhsAttribute.getNode();
		Node lhsNode = RuleUtil.getLHSNode(rhsNode);

		if (rhsAttribute.getIsMarked()) { 
			// attribute is currently marked as new and shall be demarked
			if(lhsNode == null) {
				//node is currently marked as new,
				// demark it
				add(new MarkCommand(rhsNode));
				super.execute();
			}
			
			Attribute lhsAttribute = HenshinFactory.eINSTANCE.createAttribute();
			lhsNode = RuleUtil.getLHSNode(rhsNode);
			lhsNode.getAttributes().add(lhsAttribute);
			lhsAttribute.setNode(lhsNode);
			
			// remove marker
			rhsAttribute.setMarkerType(RuleUtil.NEW);
			rhsAttribute.setIsMarked(false);
		} 
		else {
			// attribute is currently not marked, thus mark it 
			rhsAttribute.setMarkerType(RuleUtil.NEW);
			rhsAttribute.setIsMarked(true);
			// delete lhs attribute
			Attribute lhsAttribute = RuleUtil.getLHSAttribute(rhsAttribute);
			if(lhsAttribute!=null){
				add(new SimpleDeleteEObjectCommand(lhsAttribute));
			super.execute();
			}
		}
	}

	/**
	 * creates the lhs node and sets its references for a given layout.
	 * @param layout to the rhs node
	 * @return the created lhs node
	 */
	private Node createLhsNode(Node rhsNode) {
		Node lhsNode;
		lhsNode = HenshinFactory.eINSTANCE.createNode();
		
		lhsNode.setName(rhsNode.getName());
		lhsNode.setType(rhsNode.getType());
		
		Rule rule = rhsNode.getGraph().getRule();
		Graph lhsGraph = rule.getLhs();
		lhsGraph.getNodes().add(lhsNode);
		
		
		Mapping mapping = HenshinFactory.eINSTANCE.createMapping();
		mapping.setImage(rhsNode);
		mapping.setOrigin(lhsNode);
		
		rule.getMappings().add(mapping);
		return lhsNode;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.CompoundCommand#canExecute()
	 */
	@Override
	public boolean canExecute() {
		return true;
	}

}