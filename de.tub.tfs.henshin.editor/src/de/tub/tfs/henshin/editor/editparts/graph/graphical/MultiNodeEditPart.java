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
package de.tub.tfs.henshin.editor.editparts.graph.graphical;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.henshin.model.Node;

import de.tub.tfs.henshin.editor.editparts.rule.graphical.RuleNodeEditPart;
import de.tub.tfs.henshin.editor.figure.graph.MultiNodeFigure;
import de.tub.tfs.henshin.editor.util.ColorUtil;
import de.tub.tfs.henshin.editor.util.NodeUtil;

/**
 * @author angel
 * 
 */
public class MultiNodeEditPart extends RuleNodeEditPart {

	/** The width. */
	private int width;

	/**
	 * @param model
	 */
	public MultiNodeEditPart(Node model) {
		super(model);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see henshineditor.editparts.graphs.NodeEditPart#createFigure()
	 */
	@Override
	protected IFigure createFigure() {
		width = NodeUtil.getWidth(getCastedModel(), false);
		figure = new MultiNodeFigure(getCastedModel(), width, this);
		figure.setBackgroundColor(ColorUtil.int2Color(0));

		int x = 30;
		int y = 30;
		if (getLayoutModel() != null) {
			x = getLayoutModel().getX();
			y = getLayoutModel().getY();
			((MultiNodeFigure) figure).setHide(getLayoutModel().isHide());
			figure.setBackgroundColor(ColorUtil.int2Color(getLayoutModel()
					.getColor()));

		}
		figure.setLocation(new Point(x, y));
		setName(getName());

		return figure;
	}

}
