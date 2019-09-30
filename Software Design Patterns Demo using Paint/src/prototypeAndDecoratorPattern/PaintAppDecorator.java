
package prototypeAndDecoratorPattern;


public class PaintAppDecorator implements PaintApplication,Cloneable{
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

	private PaintApplication paintApp;
	
	PaintAppDecorator(PaintApplication p) 
		{
			paintApp = p;
		}
	PaintAppDecorator()
		{
			paintApp = null; 
		}
	@Override
	public void drawCanvas() {
		if (paintApp != null) 
		{
		paintApp.drawCanvas();
		System.out.println("CanvasDecorator drawCanvas");	
		}
	}

	@Override
	public void drawHeader() {
		if (paintApp != null) 
		{
		paintApp.drawHeader();
		System.out.println("CanvasDecorator drawHeader");	
		}
	}

	@Override
	public void drawFooter() {
		if (paintApp != null) 
		{ 
		paintApp.drawFooter();
		System.out.println("CanvasDecorator drawFooter");	
		}
	}
}
