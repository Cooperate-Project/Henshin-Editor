package de.tub.tfs.henshin.tggeditor.commands.create;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.gef.commands.Command;

import de.tub.tfs.henshin.tgg.TGG;
import de.tub.tfs.henshin.tgg.TRule;
import de.tub.tfs.henshin.tgg.TggFactory;
import de.tub.tfs.henshin.tggeditor.util.NodeUtil;


public class CreateAttributeCommand extends Command {
	/** The node. */
	protected Node node;
	
	/** The attribute. */
	protected Attribute attribute;
	
	/** The value. */
	protected String value;
	
	/** The type. */
	protected EAttribute type;


	/** The layout system */
	protected TGG layout;

	
	public CreateAttributeCommand (Node node, String value) {
		this.node = node;
		this.value = value;
		this.attribute = TggFactory.eINSTANCE.createTAttribute();
		this.layout = NodeUtil.getLayoutSystem(node);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	@Override
	public boolean canExecute() {
		List<Rule> ftrules = new ArrayList<Rule>();
		for (TRule ft : layout.getTRules()) {
			ftrules.add(ft.getRule());
		}
		return ftrules.contains(node.getGraph().getRule()) ? 
				node.getGraph().eContainer() instanceof NestedCondition :  
					node != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {
		if (canExecute()) {
			attribute.setValue(value);
			attribute.setType(type);
			attribute.setNode(node);
			node.getAttributes().add(attribute);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo() {
		node.getAttributes().remove(attribute);
	}

	/**
	 * Gets the node.
	 *
	 * @return the node
	 */
	public Node getNode() {
		return node;
	}
	
	public void setAttributeType(EAttribute attributeType) {
		this.type = attributeType;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
