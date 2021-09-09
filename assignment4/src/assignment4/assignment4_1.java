package assignment4;

import java.util.Scanner;

public class assignment4_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
			int c;
			try {
			c=a/b;
			System.out.println(c);
			}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero");
		}
	}

}
