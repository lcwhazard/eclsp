package EXO2;

public class Cercle extends EXO1.Point
{
	private int ray;
	public Cercle(int x, int y, int ray)
	{
		super(x, y);
		this.ray = ray;
	}
	public int getRay()
	{
		return ray;
	}
	public void setRay(int ray)
	{
		if (ray<0)
			this.ray=0;
		else this.ray=ray; 
	}
}
