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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.IndependentUnit;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;


import de.tub.tfs.henshin.tgg.interpreter.TripleComponent;
import de.tub.tfs.henshin.tgg.interpreter.util.RuleUtil;
import de.tub.tfs.henshin.tgg.interpreter.util.TggUtil;
import de.tub.tfs.henshin.tggeditor.commands.create.rule.GenerateOpRuleCommand.OpRuleEdgeProcessor;
import de.tub.tfs.henshin.tggeditor.commands.delete.rule.DeleteOpRuleCommand;

public class GenerateCCRuleCommand extends GenerateOpRuleCommand {

	public GenerateCCRuleCommand(Rule rule) {
		this(rule,null);
	}
	
	public GenerateCCRuleCommand(Rule rule,IndependentUnit unit) {
		super(rule,unit);
		prefix = "CC_";
		OP_RULE_CONTAINER_PREFIX = "CCRule_";
		OP_RULE_FOLDER = "CCRuleFolder";
		OP_RULES_PNG = "CCRules.png";
	}
	
	@Override
	protected void deleteTRule(Rule tr) {
		DeleteOpRuleCommand deleteCommand = new DeleteOpRuleCommand(
				tr,null,RuleUtil.TGG_CC_RULE);
		deleteCommand.execute();
	}

	
	@Override
	protected void addNodeProcessors(){
		// process all nodes in all three components
		nodeProcessors.put(TripleComponent.SOURCE, new OpRuleNodeProcessor());
		nodeProcessors.put(TripleComponent.CORRESPONDENCE, new OpRuleNodeProcessor(){

			@Override
			public boolean filter(Node oldNode, Node newNode) {
				
				
				if(!RuleUtil.NEW.equals(TggUtil.getElemMarker(oldNode))) {
				EList<Edge> incoming = oldNode.getIncoming();
				boolean isConstantTrace = true;
				for(Edge e : incoming) {
					if(!hasExistingTraceAsTarget(e))
						isConstantTrace = false;
				}
				if(isConstantTrace)
					return false;
					
				}
				return super.filter(oldNode, newNode);
			}
			
		});
		nodeProcessors.put(TripleComponent.TARGET, new OpRuleNodeProcessor());
	};

	@Override
	protected String getRuleMarker() {
		return RuleUtil.TGG_CC_RULE;
	}

	@Override
	protected boolean filterNode(Node node) {
		return true; // all triple components are handled
	}
}
