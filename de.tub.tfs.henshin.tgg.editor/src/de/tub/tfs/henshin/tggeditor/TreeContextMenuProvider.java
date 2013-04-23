package de.tub.tfs.henshin.tggeditor;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IMenuManager;

import de.tub.tfs.henshin.tggeditor.actions.create.graph.CreateAttributeAction;
import de.tub.tfs.henshin.tggeditor.actions.create.graph.CreateGraphAction;
import de.tub.tfs.henshin.tggeditor.actions.create.rule.CreateNACAction;
import de.tub.tfs.henshin.tggeditor.actions.create.rule.CreateParameterAction;
import de.tub.tfs.henshin.tggeditor.actions.create.rule.CreateRuleAction;
import de.tub.tfs.henshin.tggeditor.actions.create.rule.CreateRuleFolderAction;
import de.tub.tfs.henshin.tggeditor.actions.create.rule.GenerateFTRuleAction;
import de.tub.tfs.henshin.tggeditor.actions.create.rule.GenerateFTRulesAction;
import de.tub.tfs.henshin.tggeditor.actions.execution.ExecuteFTRulesAction;
import de.tub.tfs.henshin.tggeditor.actions.exports.ExportInstanceModelAction;
import de.tub.tfs.henshin.tggeditor.actions.imports.ImportCorrAction;
import de.tub.tfs.henshin.tggeditor.actions.imports.ImportEMFModelAction;
import de.tub.tfs.henshin.tggeditor.actions.imports.ImportInstanceModelAction;
import de.tub.tfs.henshin.tggeditor.actions.imports.ImportInstanceModelActionWithDefaultValues;
import de.tub.tfs.henshin.tggeditor.actions.imports.ImportSourceAction;
import de.tub.tfs.henshin.tggeditor.actions.imports.ImportTargetAction;
import de.tub.tfs.henshin.tggeditor.actions.imports.LoadReconstructXMLForSource;
import de.tub.tfs.henshin.tggeditor.actions.imports.LoadXMLXSDmodel;
import de.tub.tfs.henshin.tggeditor.actions.validate.CheckRuleConflictAction;
import de.tub.tfs.henshin.tggeditor.actions.validate.GraphValidAction;
import de.tub.tfs.henshin.tggeditor.actions.validate.RuleValidAction;
import de.tub.tfs.henshin.tggeditor.actions.validate.RuleValidateAllRulesAction;
import de.tub.tfs.muvitor.ui.ContextMenuProviderWithActionRegistry;

public class TreeContextMenuProvider extends
		ContextMenuProviderWithActionRegistry {

	public TreeContextMenuProvider(EditPartViewer viewer) {
		super(viewer);
	}

	@Override
	public void buildContextMenu(IMenuManager menu) {
		String group = GEFActionConstants.GROUP_EDIT;
		dynamicAppendActionToGroup(menu, ImportEMFModelAction.ID, group);
		dynamicAppendActionToGroup(menu, ImportSourceAction.ID, group);
		dynamicAppendActionToGroup(menu, ImportTargetAction.ID, group);
		dynamicAppendActionToGroup(menu, ImportCorrAction.ID, group);
		dynamicAppendActionToGroup(menu, ImportInstanceModelAction.ID, group);
		dynamicAppendActionToGroup(menu, ImportInstanceModelActionWithDefaultValues.ID, group);
		dynamicAppendActionToGroup(menu, CreateGraphAction.ID, group);
		dynamicAppendActionToGroup(menu, LoadReconstructXMLForSource.ID, group);
		dynamicAppendActionToGroup(menu, LoadXMLXSDmodel.ID, group);
		dynamicAppendActionToGroup(menu, CreateAttributeAction.ID, group);
		dynamicAppendActionToGroup(menu, CreateRuleAction.ID, group);
		dynamicAppendActionToGroup(menu, CreateRuleFolderAction.ID, group);
		
		dynamicAppendActionToGroup(menu, CreateNACAction.ID, group);
		dynamicAppendActionToGroup(menu, GraphValidAction.ID, group);
		dynamicAppendActionToGroup(menu, RuleValidAction.ID, group);
		dynamicAppendActionToGroup(menu, CheckRuleConflictAction.ID, group);
		dynamicAppendActionToGroup(menu, CreateParameterAction.ID, group);
		dynamicAppendActionToGroup(menu, GenerateFTRuleAction.ID, group);
		dynamicAppendActionToGroup(menu, GenerateFTRulesAction.ID, group);
		dynamicAppendActionToGroup(menu, RuleValidateAllRulesAction.ID, group);
		dynamicAppendActionToGroup(menu, ExecuteFTRulesAction.ID, group);
		dynamicAppendActionToGroup(menu, ExportInstanceModelAction.ID, group);

	}
	
	
}
