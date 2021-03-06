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
package de.tub.tfs.muvitor.ui.utils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.SAXXMIHandler;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMILoadImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;
import org.eclipse.swt.widgets.Display;
import org.xml.sax.helpers.DefaultHandler;

import de.tub.tfs.muvitor.ui.MuvitorActivator;

/**
 * Manager for persistence operations on an EMF model.
 * 
 * @author Tony Modica
 */
public class EMFModelManager {



	static HashMap<EPackage,HashMap<String, EClassifier>> conversionsClass = new HashMap<EPackage, HashMap<String,EClassifier>>();
	static HashSet<EClassifier> replacedClasses = new HashSet<EClassifier>();
	static HashMap<EClassifier,String> replacedClassesToStringMap = new HashMap();

	IProgressMonitor monitor = null;
	int lastLine = 0;
	
	static HashMap<EClassifier,SaveDelegate> saveDelegates = new HashMap<EClassifier, SaveDelegate>();
	static HashMap<EClassifier,LoadDelegate> loadDelegates = new HashMap<EClassifier, LoadDelegate>();

	/**
	 * The ResourceSet
	 */
	static ResourceSet resourceSet = new MuvitorResourceSet();

	private Map<String, Object> options = new HashMap<String, Object>();
	/**
	 * The top level models in the resource.
	 */
	private List<EObject> models = null;

	/**
	 * In EMF, a Resource provides the way to have access to the model content.
	 */
	private Resource resource = null;

	public static boolean hasClassConversion(EPackage sourceUri,String sourceClass,EClassifier targetClass){
	
		HashMap<String, EClassifier> hashMap = conversionsClass.get(sourceUri);
		if (hashMap == null)
			return false;
		if (!saveDelegates.containsKey(targetClass)){
			return false;
		}
		if (!loadDelegates.containsKey(targetClass)){
			return false;
		}
		if (!replacedClasses.contains(targetClass)){
			return false;
		}
		if (!replacedClassesToStringMap.containsKey(targetClass)){
			return false;
		}
		return true;
	}
	
	public static boolean registerClassConversion(EPackage sourceUri,
			EClass sourceClass, EClass targetClass) {
		return registerClassConversion(sourceUri, sourceClass, targetClass,
				new SaveDelegateOneClass(sourceClass,targetClass),
				new LoadDelegateOneClass());
	}
		
	public static boolean registerClassConversion(EPackage sourceUri,
			EClass sourceClass, EClass targetClass,SaveDelegate saveDelegate) {
		return registerClassConversion(sourceUri, sourceClass, targetClass,
				saveDelegate,
				new LoadDelegateOneClass());
	}
	
	public static boolean registerClassConversion(EPackage sourceUri,
			EClass sourceClass, EClass targetClass,LoadDelegate loadDelegate) {
		return registerClassConversion(sourceUri, sourceClass, targetClass,
				new SaveDelegateOneClass(sourceClass,targetClass),
				loadDelegate);
	}		
	
	public static boolean registerClassConversion(EPackage sourceUri,EClass sourceClass,EClassifier targetClass,SaveDelegate delegate,LoadDelegate load){
		if (!(sourceUri.getEFactoryInstance() instanceof DelegatingEFactory)){
			sourceUri.setEFactoryInstance(new DelegatingEFactory(sourceUri.getEFactoryInstance(),sourceUri));
		}
		if (sourceClass == null){
			saveDelegates.put(targetClass, delegate);
			loadDelegates.put(targetClass, load);
			replacedClasses.add(targetClass);
			replacedClassesToStringMap.put(targetClass, targetClass.getName());
			return true;
		} else {
			HashMap<String, EClassifier> hashMap = conversionsClass.get(sourceUri);
			if (hashMap == null)
				conversionsClass.put(sourceUri, hashMap = new HashMap<String, EClassifier>());
			hashMap.put(sourceClass.getName(), targetClass);
			saveDelegates.put(targetClass, delegate);
			loadDelegates.put(targetClass, load);
			replacedClasses.add(targetClass);
			replacedClassesToStringMap.put(targetClass, sourceClass.getName());
			return true;
		}

	}


	
	protected static LinkedList<File> findEcoreFiles(File[] listFiles) {
		LinkedList<File> result = new LinkedList<File>();
		if (listFiles == null)
			return result;
		for (File file : listFiles) {
			if (file.isDirectory()) {
				if (file.getName().equals(".svn")){
					continue;
				}
				if (file.getName().equals(".cvs")){
					continue;
				}
				if (file.getName().equals(".git")){
					continue;
				}
				LinkedList<File> f = findEcoreFiles(file.listFiles());
				result.addAll(f);
			} else {
				if (file.getName().endsWith("ecore"))
					result.add(file);
			}
		}
		return result;
	}


	/**
	 * FIXED: This ensures compatibility if models are changed from using
	 * {@link ENamedElement}s to using a custom NamedElement with default name
	 * "" or vice versa. All names of {@link ENamedElement} that are
	 * <code>null</code> are set to " " when saving the file.
	 * 
	 * FIXED: Additionally, we do not allow empty names "", because these
	 * models' URIs can not be used to resolve the models again. This only
	 * affects old models, MuvitorTreeEditor cares about this before saving as
	 * well.
	 */
	private static void recursiveSetNamesIfUnset(final List<EObject> models) {
		if (models == null)
			return;
		for (final EObject model : models) {
			if (model instanceof ENamedElement) {
				final ENamedElement namedElement = (ENamedElement) model;
				final String name = namedElement.getName();
				if (name == null || name.equals("")) {
					namedElement.setName(" ");
				}
				recursiveSetNamesIfUnset(model.eContents());
			}
			recursiveSetNamesIfUnset(model.eContents());
		}
	}


	/**
	 * This constructor initializes the EMF model package and registers a file
	 * extension.
	 * 
	 * @param extension
	 *            The file extension
	 */

	public FragmentResource requestFragmentResource(Resource r){
		
		try {
			return (FragmentResource) resourceSet.getResource(r.getURI().appendFileExtension("fragment"),true);
		} catch (Exception ex){
			return (FragmentResource) resourceSet.getResource(r.getURI().appendFileExtension("fragment"),true);
		}
		
		
	}
	
	public FragmentResource getFragmentResource(Resource r){
		
		return (FragmentResource) resourceSet.getResource(r.getURI().appendFileExtension("fragment"), false);
	}
	
	
	private static HashMap<String, EMFModelManager> modelmanager = new HashMap<String,EMFModelManager>();
	public static EMFModelManager createModelManager(String extension){
		EMFModelManager m = modelmanager.get(extension);
		if (m == null) {
			m = new EMFModelManager(extension);
			modelmanager.put(extension, m);
		}
		return m;
	}
	
	private EMFModelManager(final String extension) {

		options.put(XMLResource.OPTION_DECLARE_XML, Boolean.TRUE);
		options.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, new BasicExtendedMetaData(){

			@Override
			public EClassifier getType(EPackage ePackage, String name) {

				
				HashMap<String, EClassifier> map = conversionsClass.get(ePackage);

				
				if (map != null){
					EClassifier cl = map.get(name);
					if (cl == null)
						return super.getType(ePackage, name);
					return cl;
				}
				return super.getType(ePackage, name);
			}

			@Override
			public EClassifier getType(String namespace, String name) {
				// TODO Auto-generated method stub
				return super.getType(namespace, name);
			}

		});


		final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("fragment" ,
				new XMIResourceFactoryImpl() {
			
			
				@Override
				public Resource createResource(final URI uri) {
					
					return new FragmentResource(uri,EMFModelManager.this);
					
				}
			}
		);


		/*
		 * Register the XMI resource factory for the editor's file extension. We
		 * use a subclass that creates a special XMIResource that makes use of
		 * UUID to support EMF Clipboard as described in GMF's
		 * "Tutorial: EMF Clipboard Copy and Paste"
		 */
		reg.getExtensionToFactoryMap().put(extension,
				new XMIResourceFactoryImpl() {
			@Override
			public Resource createResource(final URI uri) {
				return new EMFResource(EMFModelManager.this, uri);
			}
		});
	}

	/**
	 * Loads the model from the file. It this fails then the passed list of
	 * default models will be set in the resource for saving later with
	 * {@link #save(IPath)}. Return the loaded or the default models,
	 * respectively.
	 * 
	 * @param path
	 *            A {@link IPath} to a file containing a {@link Resource}.
	 * @param defaultModels
	 *            a list of default models to use when loading fails
	 * @return the loaded models or the default models
	 */
	public List<EObject> load(final IPath path,
			final List<EObject> defaultModels) {

		try {

			resourceSet.getLoadOptions().putAll(options);
			resource = resourceSet.getResource(
					URI.createPlatformResourceURI(path.toString(), true), false);
			if (resource != null)
				resource.unload();
			resource = resourceSet.getResource(
					URI.createPlatformResourceURI(path.toString(), true), true);
			
			/*
			 * FIX: without calling unload() reverting does not work correctly
			 */
			//resource.unload();
			//resource.load(options);
			/*
			 * copy the contents because the resource will be emptied on
			 * "save as"
			 */
			models = new BasicEList<EObject>(resource.getContents());

		} catch (final Exception e) {
			// e.printStackTrace();
			// something failed - maybe file does not exist, so try again without loading the model and use
			// the defaultModel instead
			if (resource == null) {
				// create a resource if getting one has failed before
				resource = resourceSet.createResource(URI.createPlatformResourceURI(
						path.toString(), true));
			}
			if (resource == null) {
				MuvitorActivator.logError(
						"Unerwarteter Fehler in EMFModelmanager: Keine Resource erzeugbar.",
						e);
				throw new NullPointerException();
			}
			resource.getContents().clear();
			resource.getContents().addAll(defaultModels);
			models = defaultModels;
		}
		recursiveSetNamesIfUnset(models);
		return models;
	}
	
	/**
	 * Loads the model from the file. It this fails then the passed list of
	 * default models will be set in the resource for saving later with
	 * {@link #save(IPath)}. Return the loaded or the default models,
	 * respectively.
	 * 
	 * @param path
	 *            A {@link IPath} to a file containing a {@link Resource}.
	 * @param defaultModels
	 *            a list of default models to use when loading fails
	 * @return the loaded models or the default models
	 */
	public List<EObject> load(final String path,
			final List<EObject> defaultModels) {

		try {

			resourceSet.getLoadOptions().putAll(options);
			resource = resourceSet.getResource(
					URI.createURI(path.toString(), true), false);
			if (resource != null)
				resource.unload();
			resource = resourceSet.getResource(
					URI.createURI(path.toString(), true), true);
			
			/*
			 * FIX: without calling unload() reverting does not work correctly
			 */
			//resource.unload();
			//resource.load(options);
			/*
			 * copy the contents because the resource will be emptied on
			 * "save as"
			 */
			models = new BasicEList<EObject>(resource.getContents());

		} catch (final Exception e) {
			e.printStackTrace();
			// something failed, so try again without loading the model and use
			// the defaultModel instead
			if (resource == null) {
				// create a resource if getting one has failed before
				resource = resourceSet.createResource(URI.createURI(
						path.toString(), true));
			}
			if (resource == null) {
				MuvitorActivator.logError(
						"Unerwarteter Fehler in EMFModelmanager: Keine Resource erzeugbar.",
						e);
				throw new NullPointerException();
			}
			resource.getContents().clear();
			resource.getContents().addAll(defaultModels);
			models = defaultModels;
		}
		recursiveSetNamesIfUnset(models);
		return models;
	}
	

	public void save(final IPath path, boolean isPlatform,EObject... rootObjects) throws IOException {
		// This sets the model as contents in a new resource when using save as.
		URI uri = isPlatform ? URI.createPlatformResourceURI(path.toString(),
				true) : URI.createFileURI(path.toString());

		try {
			resource = resourceSet.getResource(uri, true);
		} catch (final Exception e) {
			resource = resourceSet.createResource(uri);
		}

		options.put(XMLResource.OPTION_DECLARE_XML, Boolean.TRUE);

		options.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		recursiveSetNamesIfUnset(models);
		resource.getContents().clear();
		if (rootObjects.length > 0)
			resource.getContents().addAll(Arrays.asList(rootObjects));
		else
			resource.getContents().addAll(models);
		resource.save(options);

	}

	/**
	 * Saves the content of the model to the file.
	 */
	public void save(final IPath path,EObject... rootObjects) throws IOException {
		save(path, true,rootObjects);
	}
	
	public void setMonitor(IProgressMonitor mon){
		this.monitor = mon;
		this.lastLine = 0;
	}

	public void cleanUp() {
		conversionsClass = new HashMap<EPackage, HashMap<String,EClassifier>>();
		replacedClasses = new HashSet<EClassifier>();
		replacedClassesToStringMap = new HashMap<EClassifier, String>();

		monitor = null;
		lastLine = 0;
		
		saveDelegates = new HashMap<EClassifier,SaveDelegate>();
		loadDelegates = new HashMap<EClassifier,LoadDelegate>();

		resourceSet = new MuvitorResourceSet();
		
		options = new HashMap<String, Object>();
		/**
		 * The top level models in the resource.
		 */
		models = null;

		/**
		 * In EMF, a Resource provides the way to have access to the model content.
		 */
		resource = null;

		
	}
	
}
