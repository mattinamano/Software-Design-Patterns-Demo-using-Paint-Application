package compositeSingletonPattern;

import java.util.Stack;

public class Window extends Shapes{
	public Window()
	{
	this.shapeName="Window";
	}
	
	@Override
	public void drawShape() {
		System.out.println("draw Window");
		for(Shapes sh:shapelist)
		{
			sh.drawShape();
		}
	}
	public void addShape(Shapes sh)
	{ 
		if(manageShapes == null || manageShapes.isEmpty())
			manageShapes = new Stack<Shapes>();
		
		manageShapes.push(sh);
		shapelist.add(sh);
	}
	public void removeShape(Shapes sh)
	{
		manageShapes.pop();
		shapelist.remove(sh);
	}
	
}
