package de.tub.tfs.henshin.tgg.examples.person;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

import TGG_correspondence.TGG_correspondencePackage;
import de.tub.tfs.henshin.tgg.TggPackage;
import de.tub.tfs.henshin.tgg.interpreter.TggEngine;
import de.tub.tfs.henshin.tgg.interpreter.TggTransformationInfo;
import de.tub.tfs.henshin.tgg.interpreter.impl.TggApplicationImpl;
import de.tub.tfs.henshin.tgg.interpreter.impl.TggEngineOperational;
import de.tub.tfs.henshin.tgg.interpreter.impl.TggTransformationInfoImpl;

public class PersonExample {
	/**
	 * Relative path to the bank model files.
	 */
	public static final String PATH = "src/de/tub/tfs/henshin/tgg/examples/person";
	public static final String name_OP_RULE_FOLDER = "FTRuleFolder";

	/**
	 * Run the bank example.
	 * 
	 * @param path
	 *            Relative path to the model files.
	 * @param saveResult
	 *            Whether the result should be saved.
	 * @throws IOException
	 */
	public static void run(String path, boolean saveResult) throws IOException {

		// Create a resource set with a base directory:
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);
		TggPackage.eINSTANCE.getName();
		TGG_correspondencePackage.eINSTANCE.getName();

		// resourceSet.initPackageImplementation("org.eclipse.emf.henshin.trace.TracePackage");
		// resourceSet.registerXMIResourceFactories("fragment");

		// Load MMs
		resourceSet.registerDynamicEPackages("Left.ecore");
		resourceSet.registerDynamicEPackages("Right.ecore");

		// Load the module:
		Module module = resourceSet.getModule("Person2Person-TGG.henshin", false);

		// Load the example model into an EGraph:
		Resource persons = resourceSet.getResource("Left2.xmi");
		// persons.load(Collections.EMPTY_MAP);
		// EcoreUtil.resolveAll(module);

		EGraph inputGraph = new EGraphImpl(persons);
		// MarkerUtil.initGraphMarkers(inputGraph, TripleComponent.SOURCE);

		TggTransformationInfo trafoInfo = new TggTransformationInfoImpl();
		trafoInfo.fillTranslatedMaps(inputGraph.getRoots(), false);

		// TggHenshineGraph
		// Create an engine and a rule application:
		TggEngine engine = new TggEngineOperational(inputGraph, trafoInfo);
		UnitApplication person2Person = new TggApplicationImpl(engine, trafoInfo);
		person2Person.setEGraph(inputGraph);

		// Creating a new account for Alice...
		person2Person.setUnit(module.getUnit(name_OP_RULE_FOLDER));

		if (!person2Person.execute(null)) {
			throw new RuntimeException("Error applying TGG");
		}

		// Saving the result:
		if (saveResult) {

			List<EObject> graphRoots = inputGraph.getRoots();

			for (EObject root : graphRoots) {
					String nsURI = root.eClass().getEPackage().getNsURI();
					if (nsURI.equals("http://bx-community.wikidot.com/examples:person2person-b/Right"))
						resourceSet.saveEObject(root, "example-result.xmi");

			}

			Collection<Object> traces = EcoreUtil.getObjectsByType(graphRoots, TGG_correspondencePackage.eINSTANCE.getGenCORR());
			//TODO: Traces are missing a container
			//resourceSet.saveEObject((EObject) traceRoot, "example-trace.xmi");
			
		}
	}

	public static void main(String[] args) throws IOException {
		run(PATH, true); // we assume the working directory is the root of the
							// examples plug-in
	}
}
