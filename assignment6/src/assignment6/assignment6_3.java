package assignment6;
import java.util.Collection;
import java.util.TreeMap;
import java.util.Map.Entry;

public class assignment6_3
{

	public static void main(String args[])
	{
		TreeMap<Integer,demo> tre=new TreeMap<Integer,demo>();
		demo d1=new demo(1,"m1","c1",1000);
		demo d2=new demo(1,"m2","c1",1000);
		demo d3=new demo(1,"m3","c1",1000);
		demo d4=new demo(1,"m4","c1",1000);
		demo d5=new demo(1,"m5","c1",1000);
		demo d6=new demo(1,"m6","c1",1000);
		demo d7=new demo(1,"m7","c1",1000);
		tre.put(1,d1);
		tre.put(2,d2);
		tre.put(3,d3);
		tre.put(4,d4);
		tre.put(5,d5);
		tre.put(6,d6);
		tre.put(7,d7);
		for (Entry<Integer,demo> entry : tre.entrySet()) {
		    Integer keyn = entry.getKey();
		    demo value = entry.getValue();

		    System.out.printf("%s : %s\n", keyn, value);
		}
	}

}
class demo
{
	int i,salary;
	String name,dept;
	
	public demo(int i, String name, String dept, int salary) {
		this.i=i;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
	public String getname()
	{
	return name;
	}
	public int geti()
	{return i;}
	public int getsalary()
	{return salary;}
	public String getdept()
	{return dept;}
	 @Override
	    public String toString() {
	        return "Demo [id=" +i + ", name=" + name
	                + ", dept=" + dept + ", salary=" + salary + "]";
	 }
}