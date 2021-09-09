package assignment1;
import java.util.*;
public class assignment1_9
{
    public static void main(String[] args)
	{
		int a[][]=new int[3][3];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			int sum=0,avg=0;
			for(int j=0;j<3;j++)
			{
				sum=sum+a[i][j];
			}
			avg=sum/3;
			System.out.println("sum"+sum+"avg"+avg);
		}
	}


}
