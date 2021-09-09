package assignment6;
import java.util.*;
public class assignment6_2{
	public static void main(String args[])
	{
		char ch;
		int i=0;
		TreeMap<Integer, String> prod=new TreeMap<Integer,String>();
		Scanner s=new Scanner(System.in);
		boolean h=true;
		while(h)
		{
			System.out.println("enter your choice y for insertion n for print");
			ch=s.next().charAt(0);
		switch(ch)
		{
		case 'y':
		{
			System.out.println("Enter product");
			String product=s.next();
			if(!prod.containsValue(s));
			prod.put(i++,product);
			break;
		}
		case 'n':
		{
			h=false;
			break;
		}
		default:
			System.out.println("Invalid");
			break;
		}
		}
		System.out.println(prod);
	}
		
}
