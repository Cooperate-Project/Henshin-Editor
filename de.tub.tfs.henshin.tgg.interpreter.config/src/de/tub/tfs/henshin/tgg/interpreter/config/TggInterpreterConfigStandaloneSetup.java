/*
* generated by Xtext
*/
package de.tub.tfs.henshin.tgg.interpreter.config;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TggInterpreterConfigStandaloneSetup extends TggInterpreterConfigStandaloneSetupGenerated{

	public static void doSetup() {
		new TggInterpreterConfigStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

