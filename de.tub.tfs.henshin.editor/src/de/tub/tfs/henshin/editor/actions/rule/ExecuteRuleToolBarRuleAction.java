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
package de.tub.tfs.henshin.editor.actions.rule;

import de.tub.tfs.henshin.editor.ui.rule.RulePage;
import de.tub.tfs.muvitor.ui.MuvitorPageBookView;

/**
 * The Class ExecuteRuleToolBarRuleAction.
 */
public class ExecuteRuleToolBarRuleAction extends ExecuteRuleAction {

	/**
	 * Instantiates a new execute rule tool bar rule action.
	 * 
	 * @param part
	 *            the part
	 * @param rulePage
	 *            the rule page
	 */
	public ExecuteRuleToolBarRuleAction(MuvitorPageBookView part,
			RulePage rulePage) {
		super(part.getEditor());
		rule = rulePage.getCastedModel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see henshineditor.actions.CreateNACAction#calculateEnabled()
	 */
	@Override
	protected boolean calculateEnabled() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see henshineditor.actions.rule.ExecuteRuleAction#run()
	 */
	@Override
	public void run() {
		graph = null;
		super.run();
	}

}
