package compositeSingletonPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public abstract class Shapes implements Cloneable{
	
	protected String shapeName;
	protected List<Shapes> shapelist=new ArrayList<Shapes>();
	protected static Stack<Shapes> manageShapes;
	protected static Stack<Shapes> redohelper;
	public abstract void drawShape();
	
	
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
	
    public void undo()
    {
        if(manageShapes.size() > 0) 
        	{
        	if(redohelper == null || redohelper.isEmpty())
        		redohelper = new Stack<Shapes>();
        	redohelper.push(manageShapes.peek());
        	System.out.println(manageShapes.pop().getClass().getSimpleName()+" removed");
        	}
        else 
        	{
        	System.out.println("Can't undo\n"); 
        	}
    }
    public void redo()
    {
    	while (!redohelper.empty()) {
    		System.out.println(redohelper.pop().getClass().getSimpleName()+" redrawn");
    	}
    	
    }

    /*prototype pattern*/
	public Object Clone()
	{
		Object Clone=null;
		try
		{
			Clone=super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return Clone;
	}
	
}
