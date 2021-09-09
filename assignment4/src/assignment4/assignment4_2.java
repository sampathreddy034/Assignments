package assignment4;

import java.util.Scanner;

public class assignment4_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
			int c;
			try {
			c=a/b;
			System.out.println(c);
			throw new Exception();
			} catch (Exception e) {
				System.out.println("UnsupportedOperationException");
			}
	}

}
