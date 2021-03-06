package de.tub.tfs.henshin.tgg.interpreter.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.InterpreterFactory;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.impl.AbstractApplicationImpl;
import org.eclipse.emf.henshin.interpreter.impl.MatchImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.IndependentUnit;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;

import de.tub.tfs.henshin.tgg.interpreter.TggEngine;
import de.tub.tfs.henshin.tgg.interpreter.TggTransformationInfo;
import de.tub.tfs.henshin.tgg.interpreter.util.RuleUtil;
import de.tub.tfs.henshin.tgg.interpreter.util.TggUtil;

public class TggApplicationImpl extends AbstractApplicationImpl {

	private static final Logger LOG = Logger.getLogger(TggApplicationImpl.class);

	
	
	// Applied and undone rules:
	protected final Stack<RuleApplication> appliedRules, undoneRules;
	protected TggTransformationInfo trInfo;


	/*
	 * String name_OP_RULE_FOLDER = "FTRuleFolder"; IndependentUnit opRuleFolder
	 * = (IndependentUnit) module.getUnit(name_OP_RULE_FOLDER); List<Rule>
	 * opRules = new Vector<Rule>(); getAllRules(opRules, opRuleFolder);
	 * tggTransformation.getOpRuleList().addAll(opRules);
	 */
	protected List<Rule> opRulesList = new Vector<Rule>();
	IProgressMonitor progressMonitor;

	public TggApplicationImpl(TggEngine engine, TggTransformationInfo trInfo) {
		super(engine);
		this.trInfo = trInfo;
		appliedRules = new Stack<RuleApplication>();
		undoneRules = new Stack<RuleApplication>();
	}

	@Override
	public Assignment getAssignment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAssignment(Assignment assignment) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setParameterValue(String paramName, Object value) {
		// TODO Auto-generated method stub

	}

	@Override
	public Assignment getResultAssignment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getResultParameterValue(String paramName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	


	@Override
	public boolean execute(ApplicationMonitor monitor) {
		if (monitor == null) {
			monitor = InterpreterFactory.INSTANCE.createApplicationMonitor();
		}
		appliedRules.clear();
		
		return doExecute(monitor);
	}

	@Override
	public boolean undo(ApplicationMonitor monitor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean redo(ApplicationMonitor monitor) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * Do execute a unit. Assumes that the monitor and the result assignment is
	 * set.
	 */
	protected boolean doExecute(ApplicationMonitor monitor) {
		if (unit.isActivated()) {
			switch (unit.eClass().getClassifierID()) {
			case HenshinPackage.INDEPENDENT_UNIT:
				return executeTggTransformation(monitor);
			default:
				return false;
			}
		}
		return true;
	}

	protected boolean executeTggTransformation(ApplicationMonitor monitor) {
		IndependentUnit transformationUnit = (IndependentUnit) unit;

		for (Unit subUnit : transformationUnit.getSubUnits()) {
			if (subUnit instanceof Rule) {
				opRulesList.add((Rule) subUnit);
			}

		}

		// check if any rule can be applied
		//ruleApplicationList.clear();
		long startTimeOneStep = System.nanoTime();
		long endTimeOneStep = System.nanoTime();
		double duration = 0;
		double maxDuration = 0;
		String maxDurationRuleName = null;

		boolean foundApplication = false;
		boolean continueRuleApplications = true;

		while (continueRuleApplications) {
			boolean foundApplicationForRuleSet = false;
			// apply all rules on graph
			Rule currentRule = null;
			// printOpRuleList();
			try {
				for (Rule rule : opRulesList) {

					LOG.debug(String.format("%1$15s", graph.size() + "     "));
					LOG.debug(String.format("%1$65s", rule.getName() + " "));

					startTimeOneStep = System.nanoTime();
					if (progressMonitor != null)
						progressMonitor.subTask(" (" + rule.getName() + ")");
					currentRule = rule;
					/*
					 * Apply a rule as long as it's possible and add each
					 * successful application to ruleApplicationlist. Then fill
					 * the isTranslatedTable Start with a fresh match.
					 */
					Boolean matchesToCheck = true;
					while (matchesToCheck) {
						Iterator<Match> matchesIterator = engine.findMatches(rule, graph, new MatchImpl(rule))
								.iterator();
						boolean foundApplicationForRule = false;
						while (matchesIterator.hasNext()) {
							// refresh rule application to be used for layout
							// and debugging
							// create new rule application for each match
							LOG.debug("~");
							RuleApplicationImpl ruleApplication = new RuleApplicationImpl(engine);
							ruleApplication.setEGraph(graph);
							ruleApplication.setRule(rule);
							ruleApplication.setPartialMatch(matchesIterator.next());
							try {
								foundApplicationForRule = executeOneStep(ruleApplication, false, rule);
								foundApplicationForRuleSet = foundApplicationForRuleSet || foundApplicationForRule;

								// show one bar for each successful rule
								// application
								if (foundApplicationForRule) {
									LOG.debug("|");
								}
							} catch (RuntimeException e) {
								e.printStackTrace();
								matchesToCheck = false;
							}
						}
						// continue with this rule, if one application was
						// successful
						if (foundApplicationForRule)
							matchesToCheck = true;
						else
							matchesToCheck = false;
					}
					if (LOG.isDebugEnabled()) {
						endTimeOneStep = System.nanoTime();
						duration = (endTimeOneStep - startTimeOneStep) / (1E6);
						if (maxDuration < duration) {
							maxDuration = duration;
							maxDurationRuleName = rule.getName();
						}
						if (duration > 10)
							LOG.debug(// "Rule " + rule.getName() + ":" +
									duration + "ms");
					}

					// startTimeOneStep=System.nanoTime();
				}

			} catch (RuntimeException e) {
				LOG.error("Rule " + currentRule.getName()
						+ " caused a runtime exception. Check input parameter settings: ", e);
			}

			LOG.debug("");
			continueRuleApplications = foundApplicationForRuleSet;
			foundApplication = foundApplication || foundApplicationForRuleSet;
		}

		LOG.debug("### Rule " + maxDurationRuleName + " had the highest execution time of:" + maxDuration + "ms");

		return foundApplication;

	}

	private boolean executeOneStep(RuleApplicationImpl ruleApplication, boolean foundApplication, Rule rule) {
		if (ruleApplication.execute(null)) {
			foundApplication = true;
			// fill isTranslatedNodeMap
			List<Node> rhsNodes = rule.getRhs().getNodes();
			Match resultMatch = ruleApplication.getResultMatch();
			for (Node ruleNodeRHS : rhsNodes) {
				EObject nodeEObject = resultMatch.getNodeTarget(ruleNodeRHS);
				trInfo.getTripleComponentNodeMap().put(nodeEObject, TggUtil.getElemComponent(ruleNodeRHS));
				if (RuleUtil.Translated.equals(TggUtil.getElemMarker(ruleNodeRHS))) {
					trInfo.getTranslationMaps().getIsTranslatedNodeMap().put(nodeEObject, true);
					trInfo.updateTranslatedAttributeMap(ruleNodeRHS, nodeEObject);
					trInfo.updateTranslatedEdgeMap(ruleNodeRHS, nodeEObject, resultMatch);
				} else {
					// context node, thus check whether the edges
					// and attributes are translated
					trInfo.updateTranslatedAttributeMap(ruleNodeRHS, nodeEObject);
					trInfo.updateTranslatedEdgeMap(ruleNodeRHS, nodeEObject, resultMatch);
				}
			}
			((TggEngine) engine).postProcess(resultMatch);
			// everything successful, add the rule application
			appliedRules.add(ruleApplication);

		} else {
			// Match is not applicable, e.g. because it became invalid by a
			// previous step - TODO: possible to improve efficiency
		}
		return foundApplication;
	}
	
	
	
	

}
