package prototypeAndDecoratorPattern;

public class DarkPaintAppDecorator extends PaintAppDecorator{
	
private PaintApplication paintApp;
	
DarkPaintAppDecorator(PaintApplication p) 
	{
		paintApp = p;
	}
DarkPaintAppDecorator()
	{
		paintApp = null; 
	}
	
	public void drawCanvas() {
		if (paintApp != null) 
		{
		paintApp.drawCanvas();
		System.out.println("DarkCanvasDecorator drawCanvas");
		}
	}

	
	public void drawHeader() {
		if (paintApp != null) 
		{
		paintApp.drawCanvas();
		System.out.println("DarkCanvasDecorator drawHeader");	
		}
	}

	public void drawFooter() {
		if (paintApp != null) 
		{
		paintApp.drawCanvas();
		System.out.println("DarkCanvasDecorator drawFooter");	
		}
	}
}
