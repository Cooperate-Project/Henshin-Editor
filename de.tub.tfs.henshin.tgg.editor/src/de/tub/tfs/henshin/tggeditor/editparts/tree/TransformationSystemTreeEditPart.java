package de.tub.tfs.henshin.tggeditor.editparts.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.IndependentUnit;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.TreeItem;

import de.tub.tfs.henshin.tggeditor.editparts.tree.critical.CheckedRulePairFolder;
import de.tub.tfs.henshin.tggeditor.editparts.tree.graphical.GraphFolder;
import de.tub.tfs.henshin.tggeditor.editparts.tree.rule.FTRuleFolder;
import de.tub.tfs.henshin.tggeditor.editparts.tree.rule.RuleFolder;
import de.tub.tfs.henshin.tggeditor.util.IconUtil;
import de.tub.tfs.henshin.tggeditor.util.NodeUtil;
import de.tub.tfs.henshin.tggeditor.util.RuleUtil;
import de.tub.tfs.muvitor.gef.editparts.AdapterTreeEditPart;

public class TransformationSystemTreeEditPart extends AdapterTreeEditPart<Module> {

	public TransformationSystemTreeEditPart(Module model) {
		super(model);
	}
	
	@Override
	protected String getText() {
		//return getCastedModel().getName();
		return "Transformation System";
	}
	
	@Override
	protected List<EObject> getModelChildren() {
		List<EObject> list = new ArrayList<EObject>();
		list.add(new ImportFolder(getCastedModel()));
		list.add(new GraphFolder(getCastedModel()));
		
		//list.add(new RuleFolder(getCastedModel()));			
		//FTRules ftRules = new FTRules(getCastedModel());
		//list.add(new FTRuleFolder(getCastedModel()));
		
		List<Unit> l = new LinkedList<Unit>();
		HashSet<IndependentUnit> folders = new HashSet<IndependentUnit>();
		for (Unit unit : getCastedModel().getUnits()) {
			if (unit instanceof IndependentUnit){
				l.addAll(((IndependentUnit) unit).getSubUnits());
				folders.add((IndependentUnit) unit);
			}		
			
		}		
		list.addAll(getCastedModel().getUnits());
		list.removeAll(l);
		list.add(new CheckedRulePairFolder(getCastedModel()));
		return list;
	}

	@Override
	protected void notifyChanged(Notification notification) {
		final int featureId = notification.getFeatureID(HenshinPackage.class);
		if(notification.getEventType() == 9)
			return ;
		
		switch (featureId){
			case HenshinPackage.MODULE__INSTANCES:
			case HenshinPackage.MODULE__IMPORTS:
			case HenshinPackage.MODULE__UNITS:
				sortRulesIntoCategories(getCastedModel());
				refreshChildren();
				break;
			case HenshinPackage.MODULE__NAME:
				refreshVisuals();
				break;
			case HenshinPackage.MODULE__DESCRIPTION:
				break;

			default:
				// check that the TGGLayout of the transformation system is present (e.g. can disappear when another editor is in use)
				if (NodeUtil.getLayoutSystem(getCastedModel()) != null)
				refresh();
				break;
		}
	}
	
	@Override
	protected Image getImage() {
		try {
			return IconUtil.getIcon("transformationsystem18.png");
		} catch (Exception e) {
			return null;
		}
	}
	
	@Override
	protected void performOpen() {
		if (this.widget instanceof TreeItem) {
			TreeItem item = (TreeItem) this.widget;
			item.setExpanded(!item.getExpanded());	
		}	
	}
	
	
	public static void sortRulesIntoCategories(Module module){
		Unit ruleFolder = module.getUnit("unmarked Rules");
		if (ruleFolder instanceof IndependentUnit){
			if (((IndependentUnit) ruleFolder).getSubUnits().isEmpty())
				module.getUnits().remove(ruleFolder);
		}
		ruleFolder = module.getUnit("RuleFolder");
		if (!(ruleFolder instanceof IndependentUnit)){
			if (ruleFolder != null){
				ruleFolder.setName("Rule_" + ruleFolder.getName());
			} 
			ruleFolder = HenshinFactory.eINSTANCE.createIndependentUnit();
			ruleFolder.setName("RuleFolder");
			ruleFolder.setDescription("ruleFolder.png");
			module.getUnits().add(ruleFolder);
		}
		ruleFolder = module.getUnit("FTRuleFolder");
		if (!(ruleFolder instanceof IndependentUnit)){
			if (ruleFolder != null){
				ruleFolder.setName("FTRule_" + ruleFolder.getName());
			} 
			ruleFolder = HenshinFactory.eINSTANCE.createIndependentUnit();
			ruleFolder.setName("FTRuleFolder");
			ruleFolder.setDescription("FTRules.png");
			module.getUnits().add(ruleFolder);
		}
		
		HashSet<Unit> ignored = new HashSet<Unit>();
		
		for (Unit unit : module.getUnits()) {
			if (unit instanceof IndependentUnit){
				ignored.addAll(unit.getSubUnits(true));
			}
		}
		
		Iterator<Unit> unitIter = module.getUnits().iterator();
		while (unitIter.hasNext()) {
			Unit unit = unitIter.next();
			if (ignored.contains(unit))
				continue;
			if (!(unit instanceof IndependentUnit)){
				ruleFolder = null;
				if (unit instanceof Rule){
					if (((Rule) unit).getMarkerType() == null){
						ruleFolder = module.getUnit("unmarked Rules");
						if (!(ruleFolder instanceof IndependentUnit)){
							if (ruleFolder != null){
								ruleFolder.setName("Rule_" + ruleFolder.getName());
							} 
							ruleFolder = HenshinFactory.eINSTANCE.createIndependentUnit();
							ruleFolder.setName("unmarked Rules");
							ruleFolder.setDescription("rule.png");
							module.getUnits().add(ruleFolder);
							unitIter = module.getUnits().iterator();
						}
					} else if (((Rule) unit).getMarkerType().equals(RuleUtil.TGG_RULE)){
						ruleFolder = module.getUnit("RuleFolder");
						
					} else if (((Rule) unit).getMarkerType().equals(RuleUtil.TGG_FT_RULE)){
						ruleFolder = module.getUnit("FTRuleFolder");
						
					}
					if (!((IndependentUnit)ruleFolder).getSubUnits().contains(unit))
						((IndependentUnit)ruleFolder).getSubUnits().add(unit);
					
				}
			}				


		}
	}
}
