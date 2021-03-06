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
package de.tub.tfs.henshin.tggeditor.editparts.tree.rule;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.IndependentUnit;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import de.tub.tfs.henshin.tggeditor.commands.delete.DeleteFoldercommand;
import de.tub.tfs.henshin.tggeditor.commands.delete.DeleteGraphInstanceCommand;
import de.tub.tfs.henshin.tggeditor.commands.delete.rule.DeleteNACCommand;

public class FolderComponentEditPolicy extends ComponentEditPolicy implements
		EditPolicy {

	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		if (((IndependentUnit)getHost().getModel()).getName().equals("RuleFolder") 
				|| ((IndependentUnit)getHost().getModel()).getName().equals("FTRuleFolder")
				|| ((IndependentUnit)getHost().getModel()).getName().equals("BTRuleFolder")
				|| ((IndependentUnit)getHost().getModel()).getName().equals("CCRuleFolder")
				//NEW
				|| ((IndependentUnit)getHost().getModel()).getName().equals("ITRuleFolder")
				)
			return null;
		
		return new DeleteFoldercommand((IndependentUnit) getHost().getModel());
	}

}
