package de.tub.tfs.henshin.tggeditor.editparts.rule;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.gef.EditPolicy;

import de.tub.tfs.henshin.tggeditor.editparts.graphical.GraphEditPart;
import de.tub.tfs.henshin.tggeditor.editpolicies.rule.RuleXYLayoutEditPolicy;
import de.tub.tfs.henshin.tggeditor.util.RuleUtil;
import de.tub.tfs.muvitor.commands.SimpleDeleteEObjectCommand;


/**
 * The GraphEditPart class of Rules.
 */
public class RuleGraphicalEditPart extends GraphEditPart {
	
	/** The model */
	Rule rule;

	/**
	 * Instantiates a new rule graph edit part.
	 *
	 * @param model the model
	 */
	public RuleGraphicalEditPart(Rule model) {
		super(model.getRhs());
		registerAdapter(model.getRhs());
		registerAdapter(model);
		this.rule = model;
		
		cleanUpRule();
		

	}
	
	private void cleanUpRule() {
		// remove invalid mappings
		for (Mapping m: rule.getMappings()){
			if(m.getImage()==null || m.getOrigin()==null)
				rule.getMappings().remove(m);
		}
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new RuleXYLayoutEditPolicy());
	}
	
	@Override
	protected void setFigureNameLabel(){
		nameLabel.setText(rule.getName());
	}
	
	@Override
	protected void notifyChanged(Notification notification) {
		if (notification.getNotifier() instanceof Rule) {
			final int featureId = notification.getFeatureID(HenshinPackage.class);
			switch (featureId){
				case HenshinPackage.RULE__NAME:
					setFigureNameLabel();
					refreshVisuals();
				default:
					break; 
			}
		}
		super.notifyChanged(notification);
	}
}