package compositeSingletonPattern;

public class Triangle extends Shapes {
	public Triangle()
	{
	this.shapeName="Triangle";
	}
	@Override
	public void drawShape() {
		System.out.println("draw Triangle");
	}
}
