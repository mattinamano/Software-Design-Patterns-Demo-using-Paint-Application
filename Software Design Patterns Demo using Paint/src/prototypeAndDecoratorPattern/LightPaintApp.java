package prototypeAndDecoratorPattern;

public class LightPaintApp extends LightPaintAppDecorator{

private PaintApplication paintApp;
	
LightPaintApp(PaintApplication p) 
		{
			paintApp = p;
		}
LightPaintApp()
		{
			paintApp = null; 
		}
		
		public void drawCanvas() {
			if (paintApp != null) 
			{
			paintApp.drawCanvas();
			System.out.println("LightCanvas drawCanvas");
			}
		}

		
		public void drawHeader() {
			if (paintApp != null) 
			{
			paintApp.drawCanvas();
			System.out.println("***********************************");
			System.out.println("LightCanvas drawHeader");
			System.out.println("***********************************");
			}
		}

		public void drawFooter() {
			if (paintApp != null) 
			{
			paintApp.drawCanvas();
			System.out.println("***********************************");
			System.out.println("LightCanvas drawFooter");
			System.out.println("***********************************");
			}
		}

}
