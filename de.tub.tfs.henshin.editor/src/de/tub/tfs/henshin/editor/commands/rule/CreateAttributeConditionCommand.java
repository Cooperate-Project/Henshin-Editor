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
package de.tub.tfs.henshin.editor.commands.rule;

import org.eclipse.emf.henshin.model.AttributeCondition;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.gef.commands.Command;

/**
 * @author Johann
 * 
 */
public class CreateAttributeConditionCommand extends Command {

	private final Rule rule;

	private final String name;

	private final String conditionText;

	private AttributeCondition aCondition;

	/**
	 * @param name
	 * @param conditionText
	 */
	public CreateAttributeConditionCommand(Rule rule, String name,
			String conditionText) {
		super();
		this.rule = rule;
		this.name = name;
		this.conditionText = conditionText;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	@Override
	public boolean canExecute() {
		return name != null && conditionText != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {
		aCondition = HenshinFactory.eINSTANCE.createAttributeCondition();
		aCondition.setName(name);
		aCondition.setConditionText(conditionText);
		rule.getAttributeConditions().add(aCondition);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo() {
		rule.getAttributeConditions().remove(aCondition);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	@Override
	public void redo() {
		rule.getAttributeConditions().add(aCondition);
	}

}
