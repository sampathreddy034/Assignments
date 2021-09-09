package assignment5;
import java.util.*;
public class assignment5_2 {

	public static void main(String[] args) {
		 //HashMap<String, String> objMap = new HashMap<String, String>();
		HashMap<Integer,Double> emp=new HashMap<Integer , Double>(10);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			int j=sc.nextInt();
			double k=sc.nextDouble();
			emp.put(j, k);
		}
		System.out.println();
		System.out.println(emp+"\n");
		Set<Integer> keys = emp.keySet();
		System.out.println(keys);
		Collection<Double> key = emp.values();
		System.out.println(key);
		
		
	}

}
