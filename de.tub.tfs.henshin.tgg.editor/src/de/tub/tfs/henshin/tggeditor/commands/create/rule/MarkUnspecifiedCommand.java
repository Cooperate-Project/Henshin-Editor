/*******************************************************************************
 * Copyright (c) 2010-2015 Henshin developers. All rights reserved. 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TU Berlin, University of Luxembourg, SES S.A.
 *******************************************************************************/
package de.tub.tfs.henshin.tggeditor.commands.create.rule;

import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.gef.commands.CompoundCommand;

import de.tub.tfs.henshin.tgg.interpreter.util.RuleUtil;
import de.tub.tfs.henshin.tgg.interpreter.util.TggUtil;

/**
 * The class MarkCommand can mark a node in a rule as new or not new. It makes
 * all the needed changes in the model of the rule and in the tgg layouts.
 * When executed it either deletes the lhs node plus its mapping or it creates
 * a new lhs node plus its mapping. Also the edges are handled.
 */
public class MarkUnspecifiedCommand extends CompoundCommand {

	// this command is only relevant for nodes in a NAC
	
	/**
	 * the rhs node
	 */
	private Node rhsNode;

	/**
	 * The constructor
	 * @param newMapping the mapping between the rhs and lhs node
	 * @param rhsNode  the rhs node
	 */
	public MarkUnspecifiedCommand(Mapping newMapping, Node rhsNode) {
		this.rhsNode = rhsNode;
	}

	public MarkUnspecifiedCommand(Node rhsNode) {
		this.rhsNode = rhsNode;
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.CompoundCommand#execute()
	 */
	@Override
	public void execute() {
		getCommands().clear();
		if (TggUtil.getElemMarker(rhsNode) == null) {
			mark();
			// case: node is already marked
		} else {
			demark();
		}
		super.execute();

	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.CompoundCommand#undo()
	 */
	@Override
	public void undo() {
		execute();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.CompoundCommand#redo()
	 */
	@Override
	public void redo() {
		execute();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.CompoundCommand#canExecute()
	 */
	@Override
	public boolean canExecute() {
		return true;
	}
	
	/**
	 * marks a rule node as new and changes the model accordingly
	 */
	private void mark() {

//		lhsNode = RuleUtil.getLHSNode(rhsNode);
//		mapping = RuleUtil.getRHSNodeMapping(rhsNode);

		// mark all contained attributes as new
		for (Attribute attr : rhsNode.getAttributes()) {
			if (TggUtil.getElemMarker(attr) != null){ // attribute is already marked as created
			}
			else
			{   // mark attribute as created
				add(new MarkUnspecifiedAttributeCommand(attr));
			}
		}
		
		
		
		for(Edge e:rhsNode.getIncoming()){
			// if edge is not marked, then mark it
			if(TggUtil.getElemMarker(e) == null)
				add(new MarkUnspecifiedEdgeCommand(e));
		}
		for(Edge e:rhsNode.getOutgoing()){
			// if edge is not marked, then mark it
			if(TggUtil.getElemMarker(e) == null)
				add(new MarkUnspecifiedEdgeCommand(e));
		}

		TggUtil.setElemMarker(rhsNode, RuleUtil.TR_UNSPECIFIED);
	}
	
	/**
	 * marks a node as not new and changes the model accordingly
	 */
	private void demark() {
		TggUtil.setElemMarker(rhsNode, null);
	}
}
