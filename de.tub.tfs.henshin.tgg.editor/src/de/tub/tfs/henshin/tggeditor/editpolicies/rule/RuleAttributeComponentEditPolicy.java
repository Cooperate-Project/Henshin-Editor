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
package de.tub.tfs.henshin.tggeditor.editpolicies.rule;

import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import de.tub.tfs.henshin.tggeditor.commands.delete.rule.DeleteRuleAttributeCommand;


public class RuleAttributeComponentEditPolicy extends ComponentEditPolicy {
	
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		final Attribute attribute = (Attribute) getHost().getModel();
	
		return new DeleteRuleAttributeCommand(attribute);
	}
	
	
}
