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
package de.tub.tfs.henshin.tgg.interpreter.gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;


import de.tub.tfs.henshin.tgg.interpreter.postprocessing.AbstractPostProcessor;
import de.tub.tfs.henshin.tgg.interpreter.postprocessing.AbstractPostProcessorFactory;

public class Export {
	private static final Logger LOG = Logger.getLogger(Export.class);

	public Export() {
		// TODO Auto-generated constructor stub
	}
	
	
	public synchronized static boolean saveTargetModel(ResourceSet resSet,
			EObject root, URI uri,PriorityQueue<AbstractPostProcessorFactory> postProcessorFactories,URI sourceURI, HashMap<?,?> sharedObjectRegistry) {
		// has to be synchronised since XText serialisation is not thread-safe
		Resource res = resSet.createResource(uri);
		res.getContents().add(root);
		try {
			res.save(null);
		} catch (Exception e) {
			e.printStackTrace();
			return false;			
		}
		InputStream inputStream;
		try {
			URL url = new URL(uri.toString());
			URLConnection connection = url.openConnection();
			inputStream = connection.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
			String inputString = in.readLine();
			String fileName = FileLocator.toFileURL(url).toString();
			fileName = fileName.replaceAll("%20", " ");
			File f  = new File( fileName.substring(5) );
			String outStr = "";
			do {
				if (inputString != null && !inputString.trim().isEmpty()){
					for (AbstractPostProcessorFactory postProcessorFactory : postProcessorFactories) {
						if (postProcessorFactory.isValid(sourceURI)){
							AbstractPostProcessor postProcessor = postProcessorFactory.createPostProcessor(root);

							postProcessor.registerSharedObjects(sharedObjectRegistry);

							inputString = postProcessor.processLine(inputString);	

						}
					}
					outStr += inputString + "\r\n";
				}
				inputString = in.readLine();
			} while (inputString != null);
			
			boolean exit = false;
			while (!exit){
				exit = true;
				try {
					BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));
					out.write(outStr);
					out.close();
				} catch (Exception ex){
					exit = false;
					LOG.error("Failed to open " + f, ex);
				}		
			}
			in.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	public synchronized static void saveModel(ResourceSet resSet,
			List<EObject> roots, URI uri) {
		// has to be synchronised since XText serialisation is not thread-safe
		Resource res = resSet.createResource(uri);
		for(EObject root:roots){
			res.getContents().add(root);
		}
		try {
			res.save(null);	
		} catch (IOException e) {
			try {
				res.unload();
			} catch (Exception e2){
				e2.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
	public synchronized static void saveModel(ResourceSet resSet,
			EObject root, URI uri) {
		// has to be synchronised since XText serialisation is not thread-safe
		Resource res = resSet.createResource(uri);
			res.getContents().add(root);
		try {
			res.save(null);	
		} catch (IOException e) {
			try {
				res.unload();
			} catch (Exception e2){
				e2.printStackTrace();
			}
			e.printStackTrace();
		}
		resSet.getResources().remove(res);
	}



	synchronized static void saveModel(ResourceSet resSet,
			List<EObject> roots, URI uri, EClass eClass) {
		// has to be synchronised since XText serialisation is not thread-safe
		Resource res = resSet.createResource(uri);
		for(EObject root:roots) {
			if (eClass.isInstance(root))
				res.getContents().add(root);
		}
		try {
			res.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
