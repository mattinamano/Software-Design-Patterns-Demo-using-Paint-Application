package compositeSingletonPattern;

public class Square extends Shapes
{
	public Square()
	{
		this.shapeName="Square";
	}
	@Override
	public void drawShape() 
	{
		System.out.println("draw Square");
	} 
}
