package assignment1;

import java.util.Scanner;

public class assignment1_1 
{
	public static void main(String args[])
	{
	int i,k,arg=0,m;
	Scanner s=new Scanner(System.in);
	i=s.nextInt();
	m=i;
	for(;i>0;)
	{
		k=i%10;
		arg=arg+(k*k*k);
		i=i/10;
	}
	if(arg==i)
	System.out.println("It is a argmstrong number");
	else
		System.out.println("It is not a argmstrong number");
	}

}
