package assignment2;

public abstract class assignment2_5 {

	abstract void draw();
	public static void main(String[] args) {
		
		line l=new line();
		l.draw();
		rectangle r=new rectangle();
		r.draw();
		cube c=new cube();
		c.draw();

	}

}
class line extends assignment2_5
{
	void draw()
	{
		System.out.println("line");
	}
}
class rectangle extends assignment2_5 
{
	void draw()
	{
		System.out.println("rectangle");
	}
}
class cube extends assignment2_5
{
	void draw()
	{
		System.out.println("cube");
	}
}
