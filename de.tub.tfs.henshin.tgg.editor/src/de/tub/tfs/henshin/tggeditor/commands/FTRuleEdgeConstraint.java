package de.tub.tfs.henshin.tggeditor.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.matching.constraints.BinaryConstraint;
import org.eclipse.emf.henshin.interpreter.matching.constraints.DomainChange;
import org.eclipse.emf.henshin.interpreter.matching.constraints.DomainSlot;
import org.eclipse.emf.henshin.interpreter.matching.constraints.Variable;
import org.eclipse.emf.henshin.interpreter.util.HashList;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;

import de.tub.tfs.henshin.tgg.TEdge;
import de.tub.tfs.henshin.tgg.TRule;
import de.tub.tfs.henshin.tggeditor.util.NodeTypes;
import de.tub.tfs.henshin.tggeditor.util.NodeTypes.NodeGraphType;
import de.tub.tfs.henshin.tggeditor.util.NodeUtil;
import de.tub.tfs.henshin.tggeditor.util.RuleUtil;
import de.tub.tfs.henshin.tggeditor.util.TggHenshinEGraph;

public class FTRuleEdgeConstraint implements BinaryConstraint {

	/**
	 * This hashmap will be filled during the execution of all the {@link TRule}s in the 
	 * {@link ExecuteFTRulesCommand}. The hashmap contains all the already translated nodes 
	 * of the graph on which the {@link TRule}s are executed.
	 */
	private HashMap<Node, Boolean> isTranslatedMap;
	/**
	 * This hashmap will be filled during the execution of all the {@link TRule}s in the 
	 * {@link ExecuteFTRulesCommand}. The hashmap contains all the already translated edges 
	 * of the graph on which the {@link TRule}s are executed.
	 */
	private HashMap<Attribute, Boolean> isTranslatedAttributeMap;
	/**
	 * This hashmap will be filled during the execution of all the {@link TRule}s in the 
	 * {@link ExecuteFTRulesCommand}. The hashmap contains all the already translated edges 
	 * of the graph on which the {@link TRule}s are executed.
	 */
	private HashMap<Edge, Boolean> isTranslatedEdgeMap;

	
	
	/**
	 * The node which can be mapped to another node in the graph (see 
	 * {@link FTRuleConstraint#check(Node graphNode)}). The node could be a node in
	 * a {@link Rule} or in a nac.
	 */
	private Node node;

	/**
	 * The rule containing the node.
	 */
	private Rule rule=null;
	
	
	
	/**
	 * Whether the node is marked to be translated before executing the rule.
	 */
	private Boolean nodeIsTranslated;
	private Edge edge;
	private EGraph graph;

	/**
	 * the constructor
	 * @param node see {@link FTRuleConstraint#node}
	 * @param isTranslatedMap see {@link FTRuleConstraint#isTranslatedMap}
	 */
	public FTRuleEdgeConstraint(Edge edge, 
			HashMap<Node, Boolean> isTranslatedMap,
			HashMap<Edge, Boolean> isTranslatedEdgeMap,
			EGraph graph) {
		
		this.node = edge.getSource();
		this.edge = edge;
		this.isTranslatedMap = isTranslatedMap;
		this.isTranslatedEdgeMap = isTranslatedEdgeMap;
		this.graph = graph;
		this.nodeIsTranslated = NodeUtil.getNodeIsTranslated(this.node);
		if (nodeIsTranslated == null)
			nodeIsTranslated = true;
		if (this.node.eContainer().eContainer() instanceof Rule) {
			// node is contained in the RHS
			rule = (Rule) this.node.eContainer().eContainer();
		} 
		else // node is contained in a NAC 
			if(this.node.eContainer().eContainer().eContainer() instanceof Rule){
			rule = (Rule) this.node.eContainer().eContainer().eContainer();
		}
		
	}

	@Override
	public boolean check(DomainSlot source, DomainSlot target) {

		Node graphNode = getGraphNode(source,graph);
		if (isSourceNode(graphNode)) {
			if (this.node.eContainer().eContainer() instanceof Rule) {
				// case: node is context node, then graph node has to be translated already
				if (nodeIsTranslated && isTranslatedMap.get(graphNode)) {
					return checkEdge(source, target);
					
					
				}				
			}
		}
		return true;
	}


	private boolean checkEdge(DomainSlot source, DomainSlot target){

		EReference reference = edge.getType();
		Edge ruleEdge = edge;
		Node sourceGraphNode = getGraphNode(source,graph);
		// Variable targetVariable = refConstraint.getTarget();

		// iterate over all possible target graph nodes
		Node targetGraphNode;
		//			boolean success = false;


		// currentReferredObjects shall contain all targets that were found up to now for this reference 
		Collection<EObject> currentReferredObjects = new ArrayList<EObject>(1);

		// retrieve the currently possible matches of the target node to possible target nodes in the graph 
		if(target.isLocked()) {
			if (target.getValue()!=null) 
				currentReferredObjects.add(target.getValue()); 
		}

		else if(target.getDomain()!=null)
			currentReferredObjects = target.getDomain();
		else if (target.getTemporaryDomain()!=null)
			currentReferredObjects = target.getTemporaryDomain();

		if (currentReferredObjects.isEmpty()) 
			return false;


		// newReferredObjects shall contain all valid targets of this reference concerning the conditions on translation markers
		// this array is a subset of currentReferredObjects
		Collection<EObject> newReferredObjects = new ArrayList<EObject>(1);

		// if a change of currently possible matches for the target node occurs, it will trigger a domain change
		boolean changeOccurred = false;


		// iterate over each currently possible target node in the graph for this reference
		for (EObject targetNodeObject : currentReferredObjects) {
			targetGraphNode = getGraphNode(targetNodeObject, graph);

			// if target node is not in source component, then stop
			if (!isSourceNode(targetGraphNode)){
				return true;
			}
			else{

				boolean ruleEdgeIsTranslated = !RuleUtil.Translated.equals(((TEdge) ruleEdge).getMarkerType());
				Edge graphEdge = findEdge(sourceGraphNode, targetGraphNode,
						ruleEdge.getType());
				if (ruleEdge.getType().isDerived()){
					return true;
				}
				// reduce the possible target domain for the target node, if
				// translation markers do not fit
				if (ruleEdgeIsTranslated) {
					// case: context edge, thus edge has to be translated
					// already,
					if (isTranslatedEdgeMap.get(graphEdge))
						newReferredObjects.add(targetNodeObject);
					else changeOccurred = true;
				} else { // case: edge is translated by rule, thus should
					// not be translated already
					if (!isTranslatedEdgeMap.get(graphEdge))
						newReferredObjects.add(targetNodeObject);
					else changeOccurred = true;
				}
			}
		}

		// if there are no remaining valid targets for the current reference, then stop here and backtrack the matching
		if (newReferredObjects.isEmpty()) 
			return false;

		if(changeOccurred){
			DomainChange change = new DomainChange(target,
					target.getTemporaryDomain());
			source.getRemoteChangeMap().put(this, change);
			target.setTemporaryDomain(new ArrayList<EObject>(newReferredObjects));

			if (change.getOriginalValues() != null)
				target.getTemporaryDomain().retainAll(
						change.getOriginalValues());
			boolean r = !target.getTemporaryDomain().isEmpty();
			if (!r)
				return false;;
		}
		
		return true;
	}
	
	private Node getGraphNode(DomainSlot slot, EGraph graph) {
		// TODO Auto-generated method stub
		return ((TggHenshinEGraph)graph).getObject2NodeMap().get(slot.getValue());
	}
	
	private Node getGraphNode(EObject slot, EGraph graph) {
		// TODO Auto-generated method stub
		return ((TggHenshinEGraph)graph).getObject2NodeMap().get(slot);
	}

	/**
	 * Checks if a graphnode is a source node.
	 * @param graphNode
	 * @return true if it is a source node, else false
	 */
	private boolean isSourceNode(Node graphNode) {
		//return isTranslatedMap.get(graphNode)!=null;
		NodeGraphType type = NodeTypes.getNodeGraphType(graphNode);
		return type == NodeGraphType.SOURCE;
	}

	/**
	 * Find the edge between a source node and a target node with a specific type. Is just working 
	 * when there is not more than one one type of edge between the two nodes allowed.
	 * @param source source node
	 * @param target target node
	 * @param type type of the edge
	 * @return edge between the source and the target node with a specific type
	 */
	private Edge findEdge(Node source, Node target, EReference type) {
		for (Edge e : source.getOutgoing()) {
			if (e.getType() == type &&
					e.getTarget() == target) {
				return e;
			}
		}
		return null;
	}

}
