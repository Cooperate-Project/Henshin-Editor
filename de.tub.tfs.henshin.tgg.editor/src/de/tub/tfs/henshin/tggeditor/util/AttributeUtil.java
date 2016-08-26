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
package de.tub.tfs.henshin.tggeditor.util;

import org.eclipse.emf.henshin.model.Attribute;

import de.tub.tfs.henshin.tgg.TAttribute;
import de.tub.tfs.henshin.tgg.interpreter.util.TggUtil;

public class AttributeUtil {

	// NEW
	public static void setAttributeMarker(Attribute attribute, String markerType) {
		TggUtil.setElemMarker((TAttribute) attribute, markerType);

	}

	// NEW
	public static String getAttributeMarker(Attribute attribute) {
		return TggUtil.getElemMarker((TAttribute) attribute);
	}

}