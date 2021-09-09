package assignment3;

public class assignment3_3 {
	public static void main(String args[])
	{
		String s="Java String pool refers to collection of Strings which are stored in heap memory ";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.replace('a','$'));
		System.out.println(s.contains("collection"));
		System.out.println(s.contains("java string pool refers to collection of strings in heap memory"));
		System.out.println(s.equals("java string pool refers to collection of strings in heap memory"));
	}
}
