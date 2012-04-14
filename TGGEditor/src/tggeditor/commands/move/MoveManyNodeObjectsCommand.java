package tggeditor.commands.move;

import java.util.List;

import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.ChangeBoundsRequest;

import tggeditor.editparts.graphical.NodeObjectEditPart;

public class MoveManyNodeObjectsCommand extends CompoundCommand {
	
	/**
	 * creates a move command for every node object
	 *
	 * @param editparts list of all elements to move
	 * @param request the change bounds request
	 */
	public MoveManyNodeObjectsCommand(List<?> editparts, ChangeBoundsRequest request) {
		super();
		for (Object nodeObjectEditpart:editparts){
			if (nodeObjectEditpart instanceof NodeObjectEditPart) {
				add(new MoveNodeObjectCommand((NodeObjectEditPart) nodeObjectEditpart, request));
			}
		}
	}

}