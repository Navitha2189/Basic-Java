package pack3;

public class Nonstatic3
{
	void call1()
	{
		System.out.println("Hi this is one non static method");
	}
	void call2()
	{
	System.out.println("This is 2nd non static method");
	}
	void call3(int b)
	{
	System.out.println("This is 3rd non static method"+b);
	}
public static void main(String[] args)
{
	Nonstatic3 n= new Nonstatic3();
	n.call1();
	n.call2();
	n.call3(2);
}

}
