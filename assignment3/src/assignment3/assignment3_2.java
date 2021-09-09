package assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class assignment3_2 {
	public static void main(String args[]) throws IOException
	{
		InputStreamReader s=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(s);
		String str=b.readLine();
		String str1=b.readLine();
		System.out.println(str+str1);
		System.out.println(str.concat(str1));
	}

}