package prototypeAndDecoratorPattern;

public class DarkPaintApp extends DarkPaintAppDecorator{

	private PaintApplication paintApp;
	
	DarkPaintApp(PaintApplication p) 
		{
			paintApp = p;
		}
	DarkPaintApp()
		{
			paintApp = null; 
		}
		
		public void drawCanvas() {
			if (paintApp != null) 
			{
			paintApp.drawCanvas();
			System.out.println("DarkCanvas drawCanvas");
			}
		}

		
		public void drawHeader() {
			if (paintApp != null) 
			{
			paintApp.drawCanvas();
			System.out.println("***********************************");
			System.out.println("DarkCanvas drawHeader");
			System.out.println("***********************************");
			}
		}

		public void drawFooter() {
			if (paintApp != null) 
			{
			paintApp.drawCanvas();
			System.out.println("***********************************");
			System.out.println("DarkCanvas drawFooter");	
			System.out.println("***********************************");
			}
		}

}
