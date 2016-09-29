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

import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.IndependentUnit;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;

import de.tub.tfs.henshin.tgg.interpreter.TripleComponent;
import de.tub.tfs.henshin.tgg.interpreter.util.NodeUtil;
import de.tub.tfs.henshin.tgg.interpreter.util.RuleUtil;
import de.tub.tfs.henshin.tgg.interpreter.util.TggUtil;
import de.tub.tfs.henshin.tggeditor.commands.delete.rule.DeleteOpRuleCommand;

public class GenerateFTRuleCommand extends GenerateOpRuleCommand {

	public GenerateFTRuleCommand(Rule rule) {
		this(rule,null);
		
	}
	

	public GenerateFTRuleCommand(Rule rule,IndependentUnit unit) {
		super(rule,unit);
		prefix = "FT_";
		OP_RULE_CONTAINER_PREFIX = "FTRule_";
		OP_RULE_FOLDER = "FTRuleFolder";
		OP_RULES_PNG = "FTRules.png";
	}
	
	@Override
	protected void deleteTRule(Rule tr) {
		DeleteOpRuleCommand deleteCommand = new DeleteOpRuleCommand(
				tr,null,RuleUtil.TGG_FT_RULE);
		deleteCommand.execute();
	}


	@Override
	protected void addNodeProcessors(){
		// process all nodes in the source component
		nodeProcessors.put(TripleComponent.SOURCE, new OpRuleNodeProcessor());
	};
	
	
	
	
	@Override
	protected void addEdgeProcessors() {
		edgeProcessors.add(new OpRuleEdgeProcessor() {
			
			@Override
			public void process(Edge oldEdge, Edge newEdge) {
				if (RuleUtil.NEW.equals(TggUtil.getElemMarker(oldEdge)) && hasExistingTraceAsTarget(oldEdge)) {
					setEdgeMarker(newEdge, null);

					// LHS
					Node sourceTNodeLHS = RuleUtil.getLHSNode(newEdge
							.getSource());
					Node targetTNodeLHS = RuleUtil.getLHSNode(newEdge
							.getTarget());

					// LHS
					Edge tEdgeLHS = copyEdge(oldEdge, tRuleLhs);
					newEdge.getGraph().getRule().getLhs().getEdges()
							.add(tEdgeLHS);
					tEdgeLHS.setSource(sourceTNodeLHS);
					tEdgeLHS.setTarget(targetTNodeLHS);
					// for matching constraint
					setEdgeMarker(tEdgeLHS, null);
						
				}
				else
					super.process(oldEdge, newEdge);
			}
			
			@Override
			public boolean filter(Edge oldEdge) {
				boolean allSource = filterNode(oldEdge.getSource()) && 
						filterNode(oldEdge.getTarget());
				
				//Edge from source to existing trace
				boolean isTraceToExistingCorr = filterNode(oldEdge.getSource()) &&
						hasExistingTraceAsTarget(oldEdge);
				
				return allSource || isTraceToExistingCorr;
			}
		});
		super.addEdgeProcessors();
	}
	
	private static boolean hasExistingTraceAsTarget(Edge oldEdge) {
		return TripleComponent.CORRESPONDENCE.equals(
				TggUtil.getElemComponent(oldEdge.getTarget()))
				 && !RuleUtil.NEW.equals(TggUtil.getElemMarker(oldEdge.getTarget()));
	}


	@Override
	protected String getRuleMarker() {
		return RuleUtil.TGG_FT_RULE;
	}
	@Override
	protected boolean filterNode(Node node) {
		return NodeUtil.isSourceNode(node);
	}
	
}
