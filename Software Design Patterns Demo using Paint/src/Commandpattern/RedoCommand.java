package Commandpattern;

import compositeSingletonPattern.Shapes;

public class RedoCommand implements Command{

Shapes shapes;
	
	public RedoCommand(Shapes shapes) 
    { 
       this.shapes = shapes; 
    } 
	@Override
	public void execute() {
		shapes.redo();
	}
}
