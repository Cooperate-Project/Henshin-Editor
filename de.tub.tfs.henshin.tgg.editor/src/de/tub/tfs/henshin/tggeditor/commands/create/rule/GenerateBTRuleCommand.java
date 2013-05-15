package de.tub.tfs.henshin.tggeditor.commands.create.rule;

import java.io.StringReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.IndependentUnit;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import sun.org.mozilla.javascript.internal.CompilerEnvirons;
import sun.org.mozilla.javascript.internal.Parser;
import sun.org.mozilla.javascript.internal.ast.AstNode;
import sun.org.mozilla.javascript.internal.ast.AstRoot;
import sun.org.mozilla.javascript.internal.ast.NodeVisitor;
import de.tub.tfs.henshin.tgg.TAttribute;
import de.tub.tfs.henshin.tgg.TEdge;
import de.tub.tfs.henshin.tgg.TNode;
import de.tub.tfs.henshin.tgg.TRule;
import de.tub.tfs.henshin.tgg.TripleComponent;
import de.tub.tfs.henshin.tggeditor.commands.delete.rule.DeleteBTRuleCommand;
import de.tub.tfs.henshin.tggeditor.util.NodeUtil;
import de.tub.tfs.henshin.tggeditor.util.RuleUtil;

public class GenerateBTRuleCommand extends ProcessRuleCommand {

	public GenerateBTRuleCommand(Rule rule) {
		this(rule,null);
		
	}
	
	private LinkedList<Parameter> unassignedParameters = new LinkedList<Parameter>();
	private CompilerEnvirons environs;
	private Parser parser;
	
	public GenerateBTRuleCommand(Rule rule,IndependentUnit unit) {
		super(rule,unit);
		prefix = "BT_";
		environs = new CompilerEnvirons();
		parser = new Parser(environs);
		unassignedParameters.addAll(rule.getParameters());

		/*for (Node node : rule.getRhs().getNodes()) {
			for (Attribute attr  : node.getAttributes()) {
				for (Iterator<Parameter> itr = unassignedParameters.iterator(); itr.hasNext();) {
					Parameter p = itr.next();
					if (attr.getValue().equals(p.getName()))
					{
						itr.remove();
					}
				}
			}
		}*/
			
		for (Node node : rule.getLhs().getNodes()) {
			for (Attribute attr  : node.getAttributes()) {
				for (Iterator<Parameter> itr = unassignedParameters.iterator(); itr.hasNext();) {
					Parameter p = itr.next();
					if (p.getName().equals(attr.getValue()))
					{
						itr.remove();
					}
				}
			}
		}
		
		nodeProcessors.put(TripleComponent.TARGET, new NodeProcessor() {
			
			@Override
			public void process(Node oldNodeRHS, Node newNode) {
				Node tNodeRHS = newNode;
				
				Node tNodeLHS = copyNodePure(oldNodeRHS, newNode.getGraph().getRule().getLhs());

				setNodeLayoutAndMarker(tNodeRHS, oldNodeRHS,
						RuleUtil.Translated);
				// set marker also in LHS, for checking the matching constraint during execution 
				setNodeMarker(tNodeLHS, oldNodeRHS,
						RuleUtil.Translated);

				setMapping(tNodeLHS, tNodeRHS);

				// update all markers for the attributes
				TAttribute newAttLHS = null;
				TAttribute newAttRHS = null;
				for (Attribute oldAttribute : oldNodeRHS.getAttributes()) {
					
					newAttRHS = (TAttribute) getCopiedObject(oldAttribute);
					if (newAttRHS.getMarkerType().equals(RuleUtil.NEW)){
						newAttLHS = (TAttribute) copyAtt(oldAttribute, tNodeLHS);
						setAttributeMarker(newAttRHS, oldAttribute,
								RuleUtil.Translated);
						// marker needed for matching constraint
						setAttributeMarker(newAttLHS, oldAttribute,
								RuleUtil.Translated);
						
						final LinkedHashSet<String> usedVars = new LinkedHashSet<String>();
						final LinkedHashSet<String> definedVars = new LinkedHashSet<String>();
						
						try {
							AstRoot parse2 = parser.parse(new StringReader(newAttLHS.getValue()), "http://testURi", 1);
							parser = new Parser(environs);
							System.out.println("");
							
							parse2.visitAll(new NodeVisitor() {
								
								private boolean nextIsVar;

								@Override
								public boolean visit(AstNode arg0) {
									if (arg0.getType() == 39){
										if (nextIsVar){
											nextIsVar = false;
											definedVars.add(arg0.getString());
										} else {
											usedVars.add(arg0.getString());
										}
									}
									if (arg0.getType() == 122){
										nextIsVar = true;
									}
									return true;
								}
							});
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						usedVars.removeAll(definedVars);//local definition override global vars
						
						for (Iterator<Parameter> itr = unassignedParameters.iterator(); itr.hasNext();) {
							Parameter p = itr.next();
							if (usedVars.contains(p.getName())){
								newAttLHS.setValue(p.getName());
								newAttRHS.setValue(p.getName());
								itr.remove();
							}
						}
					}
				}

				oldRhsNodes2TRhsNodes.put(oldNodeRHS, tNodeRHS);
				oldLhsNodes2TLhsNodes.put(RuleUtil.getLHSNode(oldNodeRHS),
						tNodeLHS);
			}
			
			@Override
			public boolean filter(Node oldNode, Node newNode) {
				return ((TNode)oldNode).getMarkerType() != null && ((TNode)oldNode).getIsMarked() && ((TNode)oldNode).getMarkerType().equals(RuleUtil.NEW);
			}
		});
		
		edgeProcessors.add(new EdgeProcessor() {
			
			@Override
			public void process(Edge oldEdge, Edge newEdge) {
			
				Node sourceTNodeRHS = oldRhsNodes2TRhsNodes.get(oldEdge.getSource());
				Node targetTNodeRHS = oldRhsNodes2TRhsNodes.get(oldEdge.getTarget());

				setEdgeMarker(newEdge,oldEdge,RuleUtil.Translated);
				

				// LHS
				Node sourceTNodeLHS = RuleUtil.getLHSNode(sourceTNodeRHS);
				Node targetTNodeLHS = RuleUtil.getLHSNode(targetTNodeRHS);

				// LHS
				Edge tEdgeLHS = copyEdge(oldEdge, tRuleLhs);
				newEdge.getGraph().getRule().getLhs().getEdges().add(tEdgeLHS);
				tEdgeLHS.setSource(sourceTNodeLHS);
				tEdgeLHS.setTarget(targetTNodeLHS);
				// for matching constraint
				setEdgeMarker(tEdgeLHS,oldEdge,RuleUtil.Translated);

				
			}
			
			@Override
			public boolean filter(Edge oldEdge, Edge newEdge) {
				// TODO Auto-generated method stub
				return NodeUtil.isTargetNode((TNode) oldEdge.getSource())
						&& NodeUtil.isTargetNode((TNode) oldEdge.getTarget()) &&
						RuleUtil.NEW.equals(((TEdge)oldEdge).getMarkerType());
			}
		});
		
	}
	
	public IndependentUnit getContainer(IndependentUnit container){
		Unit ftContainer;
		if (container != null && !container.getName().equals("RuleFolder") ){
			Module m = (Module) EcoreUtil.getRootContainer(oldRule);
			ftContainer = m.getUnit("BT_" + container.getName());
			if (!(ftContainer instanceof IndependentUnit)){
				if (ftContainer != null){
					ftContainer.setName("BTRule_" + ftContainer.getName());
				} 
				ftContainer = HenshinFactory.eINSTANCE.createIndependentUnit();
				ftContainer.setName("BT_" + container.getName());
				ftContainer.setDescription("BTRules.png");
				m.getUnits().add(ftContainer);
				((IndependentUnit)m.getUnit("BTRuleFolder")).getSubUnits().add(ftContainer);
			} 
		} else {
			Module m = (Module) EcoreUtil.getRootContainer(oldRule);
			ftContainer = m.getUnit("BTRuleFolder");
		}
		return (IndependentUnit) ftContainer;
	}

	@Override
	protected void preProcess() {
		for (TRule tr : tgg.getTRules()) {
			Module module = oldRule.getModule();
			this.truleIndex = tgg.getTRules().indexOf(tr);

			if (tr.getRule().getName().equals(prefix + oldRule.getName())) {
				// there is already a TRule for this rule -> delete the old one
				this.update = true;
				this.oldruleIndex = module.getUnits().indexOf(tr.getRule());
				
				DeleteBTRuleCommand deleteCommand = new DeleteBTRuleCommand(
						tr.getRule(),null);
				deleteCommand.execute();
				break;
			}
		}
	}
	
	@Override
	protected String getRuleMarker() {
		// TODO Auto-generated method stub
		return RuleUtil.TGG_BT_RULE;
	}
}
