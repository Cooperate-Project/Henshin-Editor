package de.tub.tfs.henshin.tgg.interpreter;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.model.Node;

import de.tub.tfs.henshin.tgg.interpreter.impl.TranslationMaps;

public interface TggTransformationInfo {

	/**
	 * Gets the triple component node map.
	 *
	 * @return the triple component node map
	 */
	HashMap<EObject, TripleComponent> getTripleComponentNodeMap();

	/**
	 * Gets the graph.
	 *
	 * @return the graph
	 */
	EGraph getEGraph();

	/**
	 * Sets the graph.
	 *
	 * @param graph the graph to set
	 */
	void setEGraph(EGraph graph);

	/**
	 * Gets the translation maps.
	 *
	 * @return the translation maps
	 */
	TranslationMaps getTranslationMaps();
	
	/**
	 * Fills the maps with Boolean translation markers initially with the value of markerValue for each input e object.
	 *
	 * @param eObjects the e objects to be marked
	 */
	public void fillTranslatedMaps(List<EObject> eObjects, Boolean markerValue);

	public void fillTranslatedMaps(EObject eObject, Boolean markerValue);
	
	/**
	 * flag, whether attribute values can be matched to null values
	 */
	public Boolean getNullValueMatching();

	public void updateTranslatedEdgeMap(Node ruleNodeRHS, EObject nodeEObject, Match resultMatch);

	public void updateTranslatedAttributeMap(Node ruleNodeRHS, EObject nodeEObject);

}