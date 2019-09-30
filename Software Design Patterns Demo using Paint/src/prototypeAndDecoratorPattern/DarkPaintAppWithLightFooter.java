package prototypeAndDecoratorPattern;

public class DarkPaintAppWithLightFooter extends DarkPaintAppDecorator{

	private PaintApplication paintApp;
	
	DarkPaintAppWithLightFooter(PaintApplication p) 
		{
			paintApp = p;
		}
	DarkPaintAppWithLightFooter()
		{
			paintApp = null; 
		}
		
		public void drawCanvas() {
			if (paintApp != null) 
			{
			paintApp.drawCanvas();
			System.out.println("DarkCanvasWithLightFooter drawCanvas");
			}
		}

		
		public void drawHeader() {
			if (paintApp != null) 
			{
			paintApp.drawCanvas();
			System.out.println("***********************************");
			System.out.println("DarkCanvasWithLightFooter drawHeader");	
			System.out.println("***********************************");
			}
		}

		public void drawFooter() {
			if (paintApp != null) 
			{
			paintApp.drawCanvas();
			System.out.println("***********************************");
			System.out.println("DarkCanvasWithLightFooter drawFooter");
			System.out.println("***********************************");
			}
		}
		
}
