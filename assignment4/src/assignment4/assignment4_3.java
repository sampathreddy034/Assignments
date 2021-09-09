package assignment4;

import java.util.Scanner;

public class assignment4_3 {
	public static void main(String args[])
	{
		int balance=5000;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		try {
			if(n>balance)
				throw new Exception();
		} catch (Exception e) {
			System.out.println("InsufficientBalanceException");
		}
		try {
			if(n<0)
			{
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("IllegalBankTransactionEception"+e);
			System.out.println(e.getMessage());
		}
		finally {}
	}

}
