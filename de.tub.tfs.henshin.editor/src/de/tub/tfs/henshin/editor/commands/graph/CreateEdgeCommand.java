package de.tub.tfs.henshin.editor.commands.graph;

import java.util.Collection;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Mapping;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.util.HenshinMultiRuleUtil;
import org.eclipse.gef.commands.CompoundCommand;

import de.tub.tfs.henshin.editor.commands.SimpleAddEObjectCommand;
import de.tub.tfs.henshin.editor.commands.SimpleSetEFeatureCommand;
import de.tub.tfs.henshin.editor.util.HenshinLayoutUtil;
import de.tub.tfs.henshin.editor.util.JavaUtil;

/**
 * The Class CreateEdgeCommand.
 */
/**
 * @author nam
 * 
 */
public class CreateEdgeCommand extends CompoundCommand {

	/** The graph. */
	private Graph graph;

	/** The edge. */
	private Edge edge;

	/** The source. */
	private Node source;

	/** The target. */
	private Node target;

	private boolean skipCanExecuteCheck = false;
	
	/**
	 * @param e
	 * @param src
	 * @param target
	 * @param graph
	 * @param type
	 */
	public CreateEdgeCommand(Edge e, Node src, Node target, Graph graph,
			EReference type) {
		this.edge = e;
		this.edge.setType(type);
		this.graph = graph;
		this.source = src;
		this.target = target;

		init();
	}

	/**
	 * Instantiates a new creates the edge command.
	 * 
	 * @param node
	 *            the source node
	 * @param requestingObject
	 *            the requesting object
	 */
	public CreateEdgeCommand(Node node, Edge requestingObject) {
		this(requestingObject, node, null, node.getGraph(), null);
	}

	/**
	 * Instantiates a new creates the edge command.
	 * 
	 * @param graph
	 *            the graph
	 * @param source
	 *            the source
	 * @param target
	 *            the target
	 * @param typeReference
	 *            the type reference
	 */
	public CreateEdgeCommand(Graph graph, Node source, Node target,
			EReference typeReference) {
		this(HenshinFactory.eINSTANCE.createEdge(), source, target, graph,
				typeReference);
	}

	/**
	 * Gets the source.
	 * 
	 * @return the source
	 */
	public Node getSource() {
		return source;
	}

	/**
	 * Sets the target.
	 * 
	 * @param target
	 *            the new target
	 */
	public void setTarget(Node target) {
		this.target = target;

		//init();
	}

	/**
	 * Sets the type reference.
	 * 
	 * @param typeReference
	 *            the new type reference
	 */
	public void setTypeReference(EReference typeReference) {
		this.edge.setType(typeReference);
		init();
	}

	/**
	 * Gets the target.
	 * 
	 * @return the target
	 */
	public Node getTarget() {
		return target;
	}

	public Edge getEdge() {
		return edge;
	}

	/**
	 * Gets the graph.
	 * 
	 * @return the graph
	 */
	public Graph getGraph() {
		return graph;
	}

	/**
     * 
     */
	private void init() {
		if (JavaUtil.notNull(edge, source, target, graph)) {

			add(new SimpleAddEObjectCommand<Graph, Edge>(edge,
					HenshinPackage.Literals.GRAPH__EDGES, graph));

			add(new SimpleSetEFeatureCommand<Edge, Node>(edge, source,
					HenshinPackage.EDGE__SOURCE));
			add(new SimpleSetEFeatureCommand<Edge, Node>(edge, target,
					HenshinPackage.EDGE__TARGET));
			
			CompoundCommand multiNodeCommands = new CompoundCommand();
			Collection<Graph> dependentGraphs = HenshinMultiRuleUtil.getDependentGraphs(graph);
			
			
			for (Graph multiGraph : dependentGraphs) {
				Node multiSource = null;
				Node multiTarget = null;
				for (Mapping m : multiGraph.getContainerRule().getMultiMappings()) {
					if (m.getOrigin() != null && m.getOrigin().equals(source)){
						multiSource=m.getImage();
						break;
					}
				}
				for (Mapping m : multiGraph.getContainerRule().getMultiMappings()) {
					if (m.getOrigin() != null && m.getOrigin().equals(target)){
						multiTarget=m.getImage();
						break;
					}
				}
				if (multiSource == null || multiTarget == null)
					continue;
				CreateEdgeCommand c = new CreateEdgeCommand(multiGraph,multiSource,multiTarget, edge.getType());
				c.setSkipFlag(true);
				multiNodeCommands.add(c);
				
			}
			add(multiNodeCommands);
		}
	}
	
	@Override
	public boolean canExecute() {
		if (skipCanExecuteCheck)
			return true;
		if (HenshinLayoutUtil.INSTANCE.hasOriginInKernelRule(source) && HenshinLayoutUtil.INSTANCE.hasOriginInKernelRule(target))
			return false;
		return true;
	}
	
	private void setSkipFlag(boolean skip){
		this.skipCanExecuteCheck = skip;
	}
}
