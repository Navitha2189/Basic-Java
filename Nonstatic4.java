package pack3;

public class Nonstatic4 
{
	void NS1(String a, int b)
	{
		System.out.println("This is 1st non static method- Name : "+a +" & his age :"+b);
	}
	void NS2(int c)
	{
	System.out.println("This is 2nd non static method- Rollnumber : "+c);
	}
	void NS3(char c)
	{
	System.out.println("This is 3rd non static method who is : "+c);
	}
	void NS4(double a, String b)
	{
	System.out.println("This is 4th non static method- Salary: "+a+"k working in "+b);
	}
public static void main(String[] args)
{
	Nonstatic4 n= new Nonstatic4();
	n.NS1("Navin",30);
	n.NS2(321434);
	n.NS3('M');
	n.NS4(8.5,"abc company");
}
}
