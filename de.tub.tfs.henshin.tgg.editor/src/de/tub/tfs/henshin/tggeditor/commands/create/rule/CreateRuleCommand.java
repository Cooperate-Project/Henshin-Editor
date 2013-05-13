package de.tub.tfs.henshin.tggeditor.commands.create.rule;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.gef.commands.Command;

import de.tub.tfs.henshin.tgg.TggFactory;
import de.tub.tfs.henshin.tgg.TripleGraph;
import de.tub.tfs.henshin.tggeditor.util.RuleUtil;


/**
 * The class CreateRuleCommand creates a new rule for a transformation system.
 */
public class CreateRuleCommand extends Command {
	
	/** transformation system in which a rule is created */
	private Module module;
	/** rule */
	private Rule rule;
	/** name of a rule to create */
//	private String name;
	/**
	 * the lhs graph
	 */
	private Graph lhs;
	/**
	 * the rhs graph
	 */
	private TripleGraph rhs;
	


	/**
	 * the constructor
	 * @param module the transformationsystem
	 * @param name the name for the rule
	 */
	public CreateRuleCommand(Module module, String name) {
		this.module = module;
		this.rule = HenshinFactory.eINSTANCE.createRule();
//		this.name = name;
//		this.rule.setActivated(true);
		this.rule.setName(name);
		this.lhs  = HenshinFactory.eINSTANCE.createGraph();
		this.rhs = TggFactory.eINSTANCE.createTripleGraph();
		lhs.setName("lhs");
		rhs.setName("rhs");
		rule.setLhs(lhs);
		rule.setRhs(rhs);
		// mark as original rule from the tgg
		rule.setMarkerType(RuleUtil.TGG_RULE);
		rule.setIsMarked(true);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#canExecute()
	 */
	@Override
	public boolean canExecute() {		
		return module != null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	@Override
	public void execute() {
		module.getUnits().add(rule);		
	}


	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	@Override
	public void undo() {
		EList<Unit> units = module.getUnits();
		int index = units.indexOf(rule);
		units.remove(index);
		super.undo();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#canUndo()
	 */
	@Override
	public boolean canUndo() {
		return module != null && rule != null;
	}

}
