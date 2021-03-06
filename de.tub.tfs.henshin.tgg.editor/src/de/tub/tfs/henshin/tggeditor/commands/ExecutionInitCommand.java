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

import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.gef.commands.CompoundCommand;
import de.tub.tfs.henshin.tgg.TAttribute;
import de.tub.tfs.henshin.tgg.TEdge;
import de.tub.tfs.henshin.tgg.TNode;
import de.tub.tfs.henshin.tgg.interpreter.util.RuleUtil;
import de.tub.tfs.henshin.tgg.interpreter.util.TggUtil;

/**
 * The Class ExecutionInitCommand creates the initial marking for executing the operational rules on a given graph. 
 */
public abstract class ExecutionInitCommand extends CompoundCommand {


	/**
	 * The graph on which all the rules will be applied.
	 */
	protected Graph graph;

	
	
	/**the constructor
	 * @param graph {@link ExecutionInitCommand#graph}
	 * @param opRuleList {@link ExecutionInitCommand#opRuleList}
	 */
	public ExecutionInitCommand(Graph graph) {
		super();
		this.graph = graph;
	}
	
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	@Override
	public boolean canExecute() {
		return (graph != null);
	}
	
	/** Mark all nodes, attributes and edges in the marked components to be untranslated
	 * and remove the markers for all other elements
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {
		initGraphMarkers();
	}

	protected void initGraphMarkers() {
		// fills translated maps with all given elements of the graph, initial
		// value is false = not yet translated
		// component(s) that shall be marked
		TNode tNode;
		for (Node node : graph.getNodes()) {
			if (node instanceof TNode) {
				tNode=(TNode) node;
				if(isInMarkedComponent(tNode)){
					initMarkers(tNode,RuleUtil.Not_Translated_Graph);
				}
				else{
					initMarkers(tNode,null);
				}
			}
		}
	}

	private void initMarkers(TNode tNode, String marker) {
		TggUtil.setElemMarker(tNode, marker);

		// handle attributes
		for (Attribute a : tNode.getAttributes()) {
			TggUtil.setElemMarker(a, marker);
		}

		// handle edges
		if (marker == null) {
			// node shall not be marked
			for (Edge e : tNode.getOutgoing()) {
				TggUtil.setElemMarker(e, marker);
				//((TEdge) e).setMarkerType(marker);
			}
		} else { // node shall be marked
			for (Edge e : tNode.getOutgoing()) {
				if (isInMarkedComponent((TNode)e.getTarget()))
					// source and target nodes of edge are in marked component
					TggUtil.setElemMarker(e, marker);
					//((TEdge) e).setMarkerType(marker);
				else
					// target node shall not be marked, thus edge shall not be
					// marked
					TggUtil.setElemMarker(e, null);
					//((TEdge) e).setMarkerType(null);
			}
		}
	}


	protected abstract boolean isInMarkedComponent(TNode node);

}
