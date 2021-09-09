package assignment1;
import java.util.*;
public class assignment1_5 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int slab=sc.nextInt();
		if(slab>=0&&slab<=180000)
			System.out.println("NIL");
		if(slab>=181001&&slab<=300000)
			System.out.println(slab*0.1);
		if(slab>=300001&&slab<=500000)
			System.out.println(slab*0.2);
		if(slab>=500001&&slab<=1000000)
			System.out.println(slab*0.3);
	}

}
