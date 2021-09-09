package assignment2;
public class assignment2_2
{
	public static void main(String args[])
	{
		manager m=new manager();
		m.incentive(20);
		labour l=new labour();
		l.overtime(39);
		int x=m.totalsalary(500);
		int y=l.totalsalary(300);
		assignment2_2 e=new assignment2_2();
		int z=e.totalsalary(x,y);
		System.out.println("total salary is"+z);
		
	}
	int totalsalary(int x,int y)
	{
		return x+y;
	}
}
class manager extends assignment2_2
{
	int b,c;
	void incentive(int a)
	{
		b=a;
	}
	int totalsalary(int a)
	{
		c=a;
		int i=b+c;
		System.out.println("total salary of manager is"+i);
		return i;
	}
	
}
class labour extends assignment2_2
{
	int b,c;
	void overtime(int a)
	{
		b=a;
	}
	int totalsalary(int a)
	{
		c=a;
		int i=b+c;
		System.out.println("total salary of labour is"+i);
		return i;
	}
}