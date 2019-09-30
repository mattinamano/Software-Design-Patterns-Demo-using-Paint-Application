package compositeSingletonPattern;

import java.util.Stack;

public class Canvas extends Shapes{
private static Canvas obj;


public static Canvas getInstance() 
{ 
    if (obj==null)
    {
    	obj = new Canvas(); 
    	obj.shapeName="Canvas";	
    }
    return obj; 
} 

private Canvas(){
	this.shapeName="Canvas";
};
	@Override
	public void drawShape() {
		//System.out.println("draw Canvas");
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
