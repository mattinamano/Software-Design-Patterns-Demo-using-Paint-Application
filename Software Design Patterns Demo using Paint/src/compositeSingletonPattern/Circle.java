package compositeSingletonPattern;


public class Circle extends Shapes{
	
	public Circle()
	{
	this.shapeName="Circle";
	}
	@Override
	public void drawShape() {
		System.out.println("draw Circle");
	}

}