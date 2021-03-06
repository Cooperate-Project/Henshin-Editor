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
package de.tub.tfs.henshin.tggeditor.commands;

import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Node;

import de.tub.tfs.henshin.tgg.TNode;
import de.tub.tfs.henshin.tgg.interpreter.util.NodeUtil;

//NEW GERARD
/**
 * The Class ExecutionInitCCCommand creates the initial marking for executing the operational CC rules on a given graph. 
 */
public class ExecutionInitPpgDeltaBasedCCCommand extends ExecutionInitDeltaBasesCCCommand {


	/**
	 * The graph on which all the rules will be applied.
	 */
	protected Graph graph;
	
	/**the constructor
	 * @param graph {@link ExecutionInitPpgDeltaBasedCCCommand#graph}
	 * @param opRuleList {@link ExecutionInitPpgDeltaBasedCCCommand#opRuleList}
	 */
	public ExecutionInitPpgDeltaBasedCCCommand(Graph graph) {
		super(graph);
		this.graph = graph;
	}

	@Override
	protected boolean isInDeltaComponent(Node node) {
		return NodeUtil.isSourceNode((TNode)node) || NodeUtil.isTargetNode((TNode)node);
	}

}
