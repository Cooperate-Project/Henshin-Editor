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
package de.tub.tfs.henshin.tggeditor.commands.setType;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gef.commands.Command;

import de.tub.tfs.henshin.tgg.ImportedPackage;
import de.tub.tfs.henshin.tgg.TGG;
import de.tub.tfs.henshin.tgg.TggFactory;
import de.tub.tfs.henshin.tgg.interpreter.TripleComponent;
import de.tub.tfs.henshin.tgg.interpreter.util.TggUtil;

public class SetImportedPackageCommand extends Command {
	EPackage target;
	TGG tgg;
	EPackage oldTarget;
	private ImportedPackage impPackage;
	

	public SetImportedPackageCommand(EPackage target, TGG tgg, TripleComponent component) {
		this.target = target;
		this.tgg = tgg;
		TggUtil.setPackageComponent(tgg, target, component.toString());
		this.impPackage = TggFactory.eINSTANCE.createImportedPackage();
		this.impPackage.setPackage(target);
		this.impPackage.setComponent(de.tub.tfs.henshin.tgg.TripleComponent.get(component.toString()));
	}

	@Override
	public boolean canExecute() {
		return this.target != null && this.tgg != null;
	}

	@Override
	public void execute() {
		tgg.getImportedPkgs().add(impPackage);
	}

	@Override
	public void undo() {
		tgg.getImportedPkgs().remove(impPackage);
		super.undo();
	}
	
	@Override
	public void redo() {
		tgg.getImportedPkgs().add(impPackage);
	}


	
	
	
	

}
