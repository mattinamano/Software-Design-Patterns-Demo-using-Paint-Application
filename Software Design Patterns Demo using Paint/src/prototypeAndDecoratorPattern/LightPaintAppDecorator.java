package prototypeAndDecoratorPattern;

public class LightPaintAppDecorator extends PaintAppDecorator {

	private PaintApplication paintApp;
	
	LightPaintAppDecorator(PaintApplication p) 
		{
			paintApp = p;
		}
	LightPaintAppDecorator()
		{
			paintApp = null; 
		}
		
		public void drawCanvas() {
			if (paintApp != null) 
			{
			paintApp.drawCanvas();
			System.out.println("LightCanvasDecorator drawCanvas");
			}
		}

		
		public void drawHeader() {
			if (paintApp != null) 
			{
			paintApp.drawCanvas();
			System.out.println("LightCanvasDecorator drawHeader");	
			}
		}

		public void drawFooter() {
			if (paintApp != null) 
			{
			paintApp.drawCanvas();
			System.out.println("LightCanvasDecorator drawFooter");	
			}
		}

}
