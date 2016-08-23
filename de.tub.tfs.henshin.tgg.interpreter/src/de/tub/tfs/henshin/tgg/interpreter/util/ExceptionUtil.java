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

import org.apache.log4j.Logger;


public class ExceptionUtil {
	
	private static final Logger LOG = Logger.getLogger(ExceptionUtil.class);

	public static void error(String errorString) {
		Throwable t = new Throwable();
		LOG.error("TGG interpreter error: " + errorString, t);
	}
	
	

}
