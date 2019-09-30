package Commandpattern;

import compositeSingletonPattern.Shapes;

public class UndoCommand implements Command{

	Shapes shapes;
	
	public UndoCommand(Shapes shapes) 
    { 
       this.shapes = shapes; 
    } 
	@Override
	public void execute() {
		shapes.undo();
	}

}
