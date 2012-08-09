package tggeditor.editparts.graphical;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.henshin.model.Attribute;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import tgg.GraphLayout;
import tggeditor.editparts.rule.RuleEdgeEditPart;
import tggeditor.editparts.rule.RuleNodeEditPart;

public class CriticalPairEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof Graph) {
			return new GraphEditPart((Graph) model);
		}
		if(model instanceof Node){
			if (((Node)model).eContainer().eContainer() instanceof NestedCondition)
				return new NodeObjectEditPart((Node) model);
			else
				return new RuleNodeEditPart((Node) model);
		}
		if(model instanceof Attribute){
			return new AttributeEditPart((Attribute) model);
		}
		if(model instanceof Edge){			
			if (context instanceof RuleNodeEditPart)
				return new RuleEdgeEditPart((Edge) model);
			else
				return new EdgeEditPart((Edge) model);
		}
		if (model instanceof GraphLayout && context instanceof GraphEditPart) {
			return new DividerEditPart((GraphLayout) model, (GraphEditPart) context);
		}
		Assert.isTrue( model == null,"CriticalPairEditPartFactory could not create an EditPart for the model"+ model);
		return null;
	}

}
