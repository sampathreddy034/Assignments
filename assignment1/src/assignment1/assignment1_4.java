package assignment1;
import java.util.*;
public class assignment1_4 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		if(s1>60&&s2>60&&s3>60)
		{
			System.out.println("passed");
		}
		else if(s1>60&&s2>60)
		{
			System.out.println("promoted");
		}
		else if(s1>60&&s3>60)
		{
			System.out.println("promoted");
		}
		else if(s2>60&&s3>60)
		{
			System.out.println("promoted");
		}
		else
			System.out.println("fail");
	}

}
