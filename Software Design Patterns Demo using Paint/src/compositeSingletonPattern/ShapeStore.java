package compositeSingletonPattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeStore {

private static Map<String,Shapes> shapeMap=new HashMap<String,Shapes>();

static
{
	shapeMap.put("Canvas", Canvas.getInstance());	
	shapeMap.put("Circle", new Circle());
	shapeMap.put("Square", new Square());
	shapeMap.put("Triangle", new Triangle());
	shapeMap.put("OuterWindow", new Window());
	shapeMap.put("InnerWindow", new Window());
}

public static Shapes getShape(String shapeName)
{
	return (Shapes)shapeMap.get(shapeName).Clone();
}

}
