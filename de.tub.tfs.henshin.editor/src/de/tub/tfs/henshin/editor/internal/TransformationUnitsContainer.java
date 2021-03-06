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
/**
 * 
 */
package de.tub.tfs.henshin.editor.internal;

import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;

/**
 * The Class TransformationUnitsContainer.
 */
public class TransformationUnitsContainer extends
		AbstractEContainer<Unit, Module> {

	/**
	 * @param model
	 */
	public TransformationUnitsContainer(Module parent) {
		super(parent.getUnits(), parent);
	}
}
