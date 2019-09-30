package prototypeAndDecoratorPattern;

import java.util.HashMap;
import java.util.Map;

public class PaintAppDecoratorStore {

	private static Map<String,PaintAppDecorator> paintappdecoratorMap=new HashMap<String,PaintAppDecorator>();
	
	static
	{
		paintappdecoratorMap.put("LightPaintAppDecorator",new LightPaintAppDecorator());	
		paintappdecoratorMap.put("DarkPaintAppDecorator", new DarkPaintAppDecorator());		
		paintappdecoratorMap.put("LightPaintApp",new LightPaintApp());	
		paintappdecoratorMap.put("DarkPaintApp", new DarkPaintApp());
		paintappdecoratorMap.put("LightPaintAppWithDarkFooter", new LightPaintAppWithDarkFooter());
		paintappdecoratorMap.put("DarkPaintAppWithLightFooter", new DarkPaintAppWithLightFooter());
	}
	
	public static PaintAppDecorator getPaintAppDecorator(String paintappdecoratorName)
	{
		return (PaintAppDecorator)paintappdecoratorMap.get(paintappdecoratorName).Clone();
	}
	
	}
