package de.tub.tfs.henshin.tgg.interpreter.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Node;

import de.tub.tfs.henshin.tgg.interpreter.TggTransformationInfo;
import de.tub.tfs.henshin.tgg.interpreter.TripleComponent;
import de.tub.tfs.henshin.tgg.interpreter.util.RuleUtil;
import de.tub.tfs.henshin.tgg.interpreter.util.TggUtil;

public class TggTransformationInfoImpl implements TggTransformationInfo {

	private static final Logger LOG = Logger.getLogger(TggTransformationInfoImpl.class);
	
	/**
	 * the maps for the marked elements 
	 */
	protected TranslationMaps translationMaps = new TranslationMaps();
	/**
	 * the map for the marked node objects
	 */
	protected HashMap<EObject, Boolean> isTranslatedNodeMap = translationMaps.getIsTranslatedNodeMap();
	/**
	 * the map for the marked attributes
	 */
	protected HashMap<EObject, HashMap<EAttribute, Boolean>> isTranslatedAttributeMap = translationMaps.getIsTranslatedAttributeMap();
	/**
	 * the map for the marked references
	 */
	protected HashMap<EObject, HashMap<EReference, HashMap<EObject, Boolean>>> isTranslatedEdgeMap = translationMaps.getIsTranslatedEdgeMap();

	/**
	 * the map storing the triple components for each node 
	 */
	protected HashMap<EObject, TripleComponent> tripleComponentNodeMap = new HashMap<EObject, TripleComponent>();

	private EGraph eGraph;
	
	@Override
	public TranslationMaps getTranslationMaps() {
		return translationMaps;
	}
	
	private void addToTranslatedAttributeMap(EObject graphNodeEObject, EAttribute eAttr, Boolean translationMarker) {
		if(!isTranslatedAttributeMap.containsKey(graphNodeEObject)) {
			isTranslatedAttributeMap.put(graphNodeEObject,new HashMap<EAttribute,Boolean>());
		}
		putAttributeInMap(graphNodeEObject, eAttr, translationMarker);	
	}

	private void addToTranslatedEdgeMap(EObject source, EReference eRef, EObject target, Boolean translationMarker) {
		if(!isTranslatedEdgeMap.containsKey(source)) {
			isTranslatedEdgeMap.put(source,new HashMap<EReference,HashMap<EObject, Boolean>>());
		}
		if(!isTranslatedEdgeMap.get(source).containsKey(eRef)) {
			isTranslatedEdgeMap.get(source).put(eRef,new HashMap<EObject, Boolean>());
		}
		putEdgeInMap(source, eRef, target, translationMarker);	
	}
	
	/**
	 * flag, whether attribute values can be matched to null values
	 */
	public Boolean getNullValueMatching() {
		return Boolean.FALSE; //TODO: return from module annotation
	}
	
	public void updateTranslatedAttributeMap(Node ruleNodeRHS, EObject graphNodeEObject) {
		// fill isTranslatedAttributeMap
		// scan the contained attributes for <tr>
		for (Attribute ruleAttribute : ruleNodeRHS.getAttributes()) {
			String isMarked = TggUtil.getElemMarker(ruleAttribute);
			if (RuleUtil.Translated.equals(isMarked)) {
				// mark this attribute to be translated
				putAttributeInMap(graphNodeEObject, ruleAttribute.getType(), true);
			}
		}
	}
	
	private void putAttributeInMap(EObject graphNodeEObject, EAttribute eAttr, Boolean value) {
		HashMap<EAttribute,Boolean> attrMap = isTranslatedAttributeMap.get(graphNodeEObject);
		if(attrMap==null) {
			LOG.warn("!WARNING: Translated attribute map is missing node entry.");
			return;
		}
		attrMap.put(eAttr, value);
	}


	public void updateTranslatedEdgeMap(Node ruleNode, EObject sourceNodeEObject, Match resultMatch) {
		// fill isTranslatedEdgeMap
		EObject targetNodeeObject;
		// scan the outgoing edges for <tr>
		for (Edge ruleEdge : ruleNode.getOutgoing()) {
			if (RuleUtil.Translated.equals(TggUtil.getElemMarker(ruleEdge))) {
				Node ruleTarget = ruleEdge.getTarget();
				targetNodeeObject = resultMatch.getNodeTarget(ruleTarget);
				// put edge in hashmap
				putEdgeInMap(sourceNodeEObject,ruleEdge.getType(),targetNodeeObject,true);
				
			}
		}		
	}

	public void putEdgeInMap(			
			EObject sourceNodeEObject, EReference eRef, EObject targetNodeEObject, Boolean value) {
		HashMap<EReference,HashMap<EObject,Boolean>> edgeMap = isTranslatedEdgeMap.get(sourceNodeEObject);
		if(edgeMap==null) {
			LOG.warn("Translated edge map is missing node entry.");
			return;
		}
		if(!edgeMap.containsKey(eRef))
			edgeMap.put(eRef,new HashMap<EObject,Boolean>());
		edgeMap.get(eRef).put(targetNodeEObject, value);
		
	}

	@Override
	public HashMap<EObject, TripleComponent> getTripleComponentNodeMap() {
		return tripleComponentNodeMap;
	}
	
	@Override
	public void fillTranslatedMaps(List<EObject> eObjects, Boolean markerValue) {
		for (EObject o: eObjects){
			fillTranslatedMaps(o, markerValue);
		}	
	}

	
	@Override
	public void fillTranslatedMaps(EObject eObject, Boolean markerValue) {
		// fills translated maps with all given elements of the graph
		// component(s) that shall be marked (all of inputEObjects)
		
		
		// first, mark the given eObject
		isTranslatedNodeMap.put(eObject, markerValue);

		// mark all children
		TreeIterator<EObject> it = null;
		EObject obj = null;
		it = eObject.eAllContents();
		while (it.hasNext()) {
			obj = it.next();
			isTranslatedNodeMap.put(obj, markerValue);
			fillTranslatedMapsForFeatures(obj, markerValue);
		}


		// now, mark all features - edge map requires that source and target nodes are marked before
		it = eObject.eAllContents();
		while (it.hasNext()) {
			obj = it.next();
			fillTranslatedMapsForFeatures(obj, markerValue);
		}
		fillTranslatedMapsForFeatures(eObject, markerValue);


	}

	private void fillTranslatedMapsForFeatures(EObject o, Boolean markerValue) {
		final EList<EStructuralFeature> allEStructFeats = o.eClass().getEAllStructuralFeatures();
		for(EStructuralFeature esf : allEStructFeats)
		{
			// all attributes
			if (esf instanceof EAttribute){
				// if (currentEObject.eIsSet(esf)) // attribute is set // FIXME: check whether necessary
					addToTranslatedAttributeMap(o,(EAttribute)esf,markerValue);
		    }

			// all edges
			if (esf instanceof EReference){
				EReference ref = (EReference) esf;
				Object referenceValue = o.eGet(esf);
				
				if (referenceValue == null){
					// reference is not set, nothing to do
				}
				else if (referenceValue instanceof List) {
					List<Object> references = (List<Object>) referenceValue;
					for (Object targetObj: references){
						if (targetObj instanceof EObject && isTranslatedNodeMap.containsKey(targetObj)) // target eObject has to be marked as well
						addToTranslatedEdgeMap(o,ref,(EObject) targetObj,markerValue);
					}
				}
				else if (referenceValue instanceof EObject){
					if (isTranslatedNodeMap.containsKey(referenceValue)) // target eObject has to be marked as well
						addToTranslatedEdgeMap(o,ref,(EObject) referenceValue,markerValue);
				}
				else{
					LOG.warn("!WARNING: transformation initialisation error, references are not a list nor a plain object reference");
				}
		    }
		}
	}

	@Override
	public EGraph getEGraph() {
		return eGraph;
	}

	@Override
	public void setEGraph(EGraph graph) {
		eGraph = graph;
		
	}
	
	

}
