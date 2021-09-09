package assignment3;

public class assignment3_4 {
	public static void main(String args[])
	{
	StringBuffer s =new StringBuffer();
	s.append("StringBuffer");
	s.append("is a peer class of String");
	s.append("that provides much of");
	s.append("the functionality _ of strings");
	String f="It is used to_at the specified index postion";
	for (int i = 0; i <s.length(); i++)
	{
		if(s.charAt(i)=='_')
		{
			s.replace(i, i, f);
		}
	}
	System.out.println(s);
	s.reverse();
	System.out.println(s);
	}

}
