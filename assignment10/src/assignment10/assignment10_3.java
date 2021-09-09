package assignment10;
import java.util.*;
public class assignment10_3{
	public static void main(String args[])
	{
		ArrayList<String> lis=new ArrayList<>();
		lis.add("A");
		lis.add("quick");
		lis.add("brown");
		lis.add("fox");
		lis.add("jumps");
		lis.add("over");
		lis.add("the");
		lis.add("lazy");
		lis.add("dog");
		System.out.println(lis);
		Object[] lisy=lis.toArray();
		for(Object obj:lisy)
			System.out.println(obj);
		String[] array = lis.toArray(new String[lis.size()]);
		//for(Object obj:array)
			//System.out.println(array);
	}

}
