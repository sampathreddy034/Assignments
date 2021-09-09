package assignment1;
public class assignment1_2
{
	public static void main(String args[])
	{
		int i,j=0,n=999,a,b,c,d,e;
		for(i=100;i<n;i++)
		  {
		    a=i/10;
		    b=i%10;
		    c=a/10;
		    d=a%10;
		    b=b*b*b;
		    c=c*c*c;
		    d=d*d*d;
		    e=b+c+d;
		    if(i==e)
		    {
		      j++;
		      System.out.println(j+" "+i);
		    }
	    }
	}
}