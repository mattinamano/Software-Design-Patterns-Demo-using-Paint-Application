package prototypeAndDecoratorPattern;

public class LightPaintAppWithDarkFooter extends LightPaintAppDecorator{

private PaintApplication paintApp;
	
LightPaintAppWithDarkFooter(PaintApplication p) 
		{
			paintApp = p;
		}
LightPaintAppWithDarkFooter()
		{
			paintApp = null; 
		}
		
		public void drawCanvas() {
			if (paintApp != null) 
			{
			paintApp.drawCanvas();
			System.out.println("LightCanvasWithDarkFooter drawCanvas");
			}
		}

		
		public void drawHeader() {
			if (paintApp != null) 
			{
			paintApp.drawCanvas();
			System.out.println("***********************************");
			System.out.println("LightCanvasWithDarkFooter drawHeader");
			System.out.println("***********************************");
			}
		}

		public void drawFooter() {
			if (paintApp != null) 
			{
			paintApp.drawCanvas();
			System.out.println("***********************************");
			System.out.println("LightCanvasWithDarkFooter drawFooter");
			System.out.println("***********************************");
			}
		}
	
}
