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
package de.tub.tfs.henshin.tgg.interpreter.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.henshin.model.Annotation;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.ModelElement;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.impl.HenshinFactoryImpl;

import de.tub.tfs.henshin.tgg.TggPackage;
import de.tub.tfs.henshin.tgg.interpreter.TripleComponent;
import de.tub.tfs.muvitor.ui.utils.EMFModelManager;

/**
 * Class for general methods for loading triple graphs - used by HenshinTGG.
 * 
 * @author Frank Hermann
 */

public class TggUtil {


	private static final String MARKER_KEY = "marker";
	private static final String COMPONENT_KEY = "component";
	// root annotation key
	public static final String HENSHIN_TGG_PKG_KEY = "de.tu-berlin.tfs.henshin.tgg";
	public static final String HENSHIN_TGG_ANNOTATION_VALUE = "tgg";

	public static final int MARKER_ANNOTATION_POS = 0;
	public static final int COMPONENT_ANNOTATION_POS = 1;

	// markers for graph elements
	public static final String CREATE = "<++>";
	public static final String TRANSLATE = "<tr>";
	public static final String IS_TRANSLATED = "[tr]";
	public static final String IS_NOT_TRANSLATED = "[!tr]";
	public static final String[] ELEMENT_MARKERS = {CREATE,TRANSLATE,IS_TRANSLATED,IS_NOT_TRANSLATED};

	// markers for triple rules to distinguish the types of operational rules
	public static final String FW_TRANSLATION = "ft";
	public static final String BW_TRANSLATION = "bt";
	public static final String INTEGRATION = "it";
	public static final String CONSISTENCY_CREATING = "cc";
	public static final String TGG_RULE = "tgg";
	public static final String[] RULE_MARKERS = {FW_TRANSLATION,BW_TRANSLATION,INTEGRATION,CONSISTENCY_CREATING,TGG_RULE};
	
	
	public static void initClassConversions() {
		if (EMFModelManager.hasClassConversion(HenshinPackage.eINSTANCE, "Node", TggPackage.Literals.TNODE))
			return;
		
		EMFModelManager.registerClassConversion(HenshinPackage.eINSTANCE,HenshinPackage.Literals.NODE, TggPackage.Literals.TNODE);
		EMFModelManager.registerClassConversion(HenshinPackage.eINSTANCE,HenshinPackage.Literals.EDGE, TggPackage.Literals.TEDGE);
		EMFModelManager.registerClassConversion(HenshinPackage.eINSTANCE,HenshinPackage.Literals.ATTRIBUTE, TggPackage.Literals.TATTRIBUTE);
		EMFModelManager.registerClassConversion(HenshinPackage.eINSTANCE,HenshinPackage.Literals.RULE, TggPackage.Literals.TGG_RULE);
		EMFModelManager.registerClassConversion(HenshinPackage.eINSTANCE,HenshinPackage.Literals.GRAPH, TggPackage.Literals.TRIPLE_GRAPH);
		EMFModelManager.registerClassConversion(HenshinPackage.eINSTANCE,HenshinPackage.Literals.MODULE, TggPackage.Literals.TGG);
		EMFModelManager.registerClassConversion(HenshinPackage.eINSTANCE,null, TggPackage.Literals.IMPORTED_PACKAGE);
		
		
	}
	



	public static String getElemAnnotationValue(ModelElement elem,
			String key) {

		Annotation a = getElemAnnotation(elem, key);
		if (a== null)
			return null;
		return a.getValue();
	}

	
	public static Annotation getElemAnnotation(ModelElement elem,
			String key) {

		if (elem != null && key != null){
			// search for key
			for (Annotation a : elem.getAnnotations()) {
				if (key.equals(a.getKey()))
					return a;
			}
		}

		// key not found
		return null;
	}

	
	/**
	 * retrieve the Tgg annotation at position
	 * @param elem - the model element
	 * @param position - the position of the annotation that shall be retrieved
	 * @return
	 */
	public static void putElemTggAnnotation(ModelElement elem, int position, String key, String value) {
		Annotation tggAnnotation = null;
		if( elem.getAnnotations().size() > 0)
			tggAnnotation = getElemAnnotation(elem, HENSHIN_TGG_PKG_KEY);
		
		//create if not existing
		if(tggAnnotation == null) {
			tggAnnotation = createRootAnnotation();
			elem.getAnnotations().add(tggAnnotation);
		}
		
		EList<Annotation> annotations = tggAnnotation.getAnnotations();
		
		if (annotations.size() > position) {
			annotations.get(position).setKey(key);
			annotations.get(position).setValue(value);
		}
		else {
			while (annotations.size() < position){
				Annotation dummy = createElemAnnotation(null, null);
				annotations.add(dummy);
			}
			
			Annotation a = createElemAnnotation(key, value);
			annotations.add(a);
		}
		
	}

	
	/**
	 * retrieve the Tgg annotation at position
	 * @param elem - the model element
	 * @param position - the position of the annotation that shall be retrieved
	 * @return
	 */
	public static String getElemTggAnnotation(ModelElement elem, int position) {
		if (elem==null || elem.getAnnotations().size()==0)
			return null;
		Annotation a = elem.getAnnotations().get(0);
		if (a==null || (a.getAnnotations().size()<=position))
			return null;
		// nested annotation is present, thus, retrieve nested annotation
		a = a.getAnnotations().get(position);
		if(a==null)
			return null;
		// nested annotation for marker/component is present - return the value
		return a.getValue();
	}


	// retrieve the tripleComponent of an EObject
	public static List<TripleComponent> getEObjectTripleComponent(Module tgg, EClass c) {
		// retrieve the component
		List<TripleComponent> components = null;
		//List<ImportedPackage> pkgs = tgg.getImportedPkgs();
		EList<EPackage> pkgs = tgg.getImports();

		for (EPackage p : pkgs) {
			if (p == c.getEPackage())
				components = getPackageComponent(tgg, p);
		}
		return components;
	}
	
	// retrieve the marker of elem
	public static String getElemMarker(ModelElement elem) {
		return getElemTggAnnotation(elem, MARKER_ANNOTATION_POS);
	}


	// set the marker of elem
	public static void setElemMarker(ModelElement elem, String marker) {
		putElemTggAnnotation(elem, MARKER_ANNOTATION_POS, MARKER_KEY, marker);
	}

	// retrieve the component of elem
	public static List<TripleComponent> getPackageComponent(ModelElement elem, EPackage p) {
		List<String> componentAnnotations = getElemTggAnnotations(elem, p.getNsURI());
		List<TripleComponent> result = new ArrayList<TripleComponent>();
		for(String component : componentAnnotations)
			result.add(TripleComponent.valueOf(component));

		return result;
	}

	// set the component of elem
	public static void setPackageComponent(ModelElement elem, EPackage p, TripleComponent component) {
		putElemTggAnnotation(elem, p.getNsURI(), component.toString());
	}
	
	// set the component of elem
		public static void setPackageComponent(ModelElement elem, EPackage p, String component) {
			putElemTggAnnotation(elem, p.getNsURI(), component);
		}

	private static void putElemTggAnnotation(ModelElement elem, String key, String value) {
		Annotation tggAnnotation = getElemAnnotation(elem, HENSHIN_TGG_PKG_KEY);
		if(tggAnnotation == null) {
			addRootTggAnnotation(elem);
			tggAnnotation = getElemAnnotation(elem, HENSHIN_TGG_PKG_KEY);
		}
		
		addElemAnnotation(tggAnnotation, key, value);
	}

	private static List<String> getElemTggAnnotations(ModelElement elem, String key) {
		List<String> result = new ArrayList<String> ();
		Annotation tggAnnotation = getElemAnnotation(elem, HENSHIN_TGG_PKG_KEY);
		
		if (elem != null && key != null){
			// search for key
			for (Annotation a : tggAnnotation.getAnnotations()) {
				if (key.equals(a.getKey()))
					result.add(a.getValue());
			}
		}
		
		return result;
	}

	// retrieve the component of elem
	public static TripleComponent getElemComponent(ModelElement elem) {
		String componentAnnotation = getElemTggAnnotation(elem, COMPONENT_ANNOTATION_POS);
		if (componentAnnotation == null)
			return null;

		return TripleComponent.valueOf(componentAnnotation);
	}
	
	// set the component of elem
	public static void setElemComponent(ModelElement elem, String component) {
		putElemTggAnnotation(elem, COMPONENT_ANNOTATION_POS, COMPONENT_KEY, component);
	}

	// set the component of elem
	public static void setElemComponent(ModelElement elem, TripleComponent component) {
		putElemTggAnnotation(elem, COMPONENT_ANNOTATION_POS, COMPONENT_KEY, component.toString());
	}
	
	public static void addElemAnnotation(ModelElement elem, String key, String value) {
		Annotation a = createElemAnnotation(key, value); 
		elem.getAnnotations().add(a);
	}
	
	
	// add the tgg root annotation to elem
	public static void addRootTggAnnotation(ModelElement elem) {
		TggUtil.addElemAnnotation(elem, TggUtil.HENSHIN_TGG_PKG_KEY, TggUtil.HENSHIN_TGG_ANNOTATION_VALUE);
	}

	public static Annotation createRootAnnotation() {
		return createElemAnnotation(TggUtil.HENSHIN_TGG_PKG_KEY, TggUtil.HENSHIN_TGG_ANNOTATION_VALUE);
	}

	public static Annotation createElemAnnotation(String elementMarkerKey,
			String marker) {
		Annotation a = HenshinFactoryImpl.eINSTANCE.createAnnotation();
		a.setKey(elementMarkerKey);
		a.setValue(marker);
		return a;
	}
	
	

	

	
	public static EPackage getEPackage(ModelElement elem, String nsURI){
		if(nsURI == null) return null;
		Module m = getModuleFromElement(elem);
		EList<EPackage> pkgs = m.getImports();
		for(EPackage p: pkgs){
			if(nsURI.equals(p.getNsURI()))
				return p;
		}
		return null;
	}
	
	public static Module getModuleFromElement(ModelElement elem) {
		if (elem == null)
			return null;
		return (Module) elem.eContainer().eResource().getContents().get(0);
	}

	public static Boolean getIsTranslated(Node tNode) {
		return getIsTranslated(TggUtil.getElemMarker(tNode));
	}

	public static Boolean getIsTranslated(Attribute att) {
		return getIsTranslated(TggUtil.getElemMarker(att));
	}

	public static Boolean getIsTranslated(Edge tEdge) {
		return getIsTranslated(TggUtil.getElemMarker(tEdge));
	}

	private static Boolean getIsTranslated(String markerType) {
		if(markerType==null) return null;
		if(IS_TRANSLATED.equals(markerType))
			return true;
		return false;
	}
	
	public static Boolean getIsNullValueMatching(Module module) {
		if(module==null) return false;
		String value = TggUtil.getElemAnnotationValue(module, "nullValueMatching");
		return Boolean.valueOf(value);
	}

	
}
