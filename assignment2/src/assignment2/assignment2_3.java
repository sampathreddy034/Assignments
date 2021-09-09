package assignment2;

public class assignment2_3 extends bank {
	public static void main(String args[])
	{
		assignment2_3 obj=new assignment2_3();
		credit c1=new credit();
		c1.cashcredit(10);
		c1.cashcredit(10);
		saving s1=new saving();
		s1.fixeddeposit(10);
		s1.fixeddeposit(10);
		int a=s1.total_balance();
		int b=c1.total_balance();
		obj.total_balance(a,b);
	}

}
class bank {
	void total_balance(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("total cash in bank"+c);
	}
}
class credit extends bank {
	int credit=0;
	void cashcredit(int a)
	{
		credit=credit+a;
	}
	int total_balance()
	{
		int total;
		total=credit;
		return total;
	}
}
class saving extends bank {
	int fixed=0;
	void fixeddeposit(int a)
	{
		fixed=fixed+a;
	}
	int total_balance()
	{
		int total;
		total=fixed;
		return total;
	}

}
