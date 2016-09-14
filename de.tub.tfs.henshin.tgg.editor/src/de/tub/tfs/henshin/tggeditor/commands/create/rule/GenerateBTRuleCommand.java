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
import de.tub.tfs.henshin.tggeditor.commands.create.rule.GenerateOpRuleCommand.OpRuleEdgeProcessor;
import de.tub.tfs.henshin.tggeditor.commands.delete.rule.DeleteOpRuleCommand;

public class GenerateBTRuleCommand extends GenerateOpRuleCommand {

	public GenerateBTRuleCommand(Rule rule) {
		this(rule,null);
	}
	
	public GenerateBTRuleCommand(Rule rule,IndependentUnit unit) {
		super(rule,unit);
		prefix = "BT_";
		OP_RULE_CONTAINER_PREFIX = "BTRule_";
		OP_RULE_FOLDER = "BTRuleFolder";
		OP_RULES_PNG = "BTRules.png";
	}
	
	@Override
	protected void deleteTRule(Rule tr) {
		DeleteOpRuleCommand deleteCommand = new DeleteOpRuleCommand(
				tr,null,RuleUtil.TGG_BT_RULE);
		deleteCommand.execute();
	}

	@Override
	protected void addNodeProcessors(){
		// process all nodes in the source component
		nodeProcessors.put(TripleComponent.TARGET, new OpRuleNodeProcessor());
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
				else if (!hasExistingTraceAsTarget(oldEdge))
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
	}

	@Override
	protected String getRuleMarker() {
		return RuleUtil.TGG_BT_RULE;
	}
	@Override
	protected boolean filterNode(Node node) {
		return NodeUtil.isTargetNode(node);
	}
}
