/*
 * generated by Xtext
 */
package lu.uni.snt.secan.ttc_java.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import lu.uni.snt.secan.ttc_java.ui.internal.TTC_JavaActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TTC_JavaExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return TTC_JavaActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return TTC_JavaActivator.getInstance().getInjector(TTC_JavaActivator.LU_UNI_SNT_SECAN_TTC_JAVA_TTC_JAVA);
	}
	
}
