package pack3;
public class Thiscalling 
{
	Thiscalling()
	{
		this("abc"); // this will takes to Thiscalling(String name)
		System.out.println("Parent constructor"); // Lastly this gets printed
	}
	Thiscalling(String name)
	{
		this(345); // this will takes to Thiscalling(int no)
		System.out.println("Child1 Constructor "+ name); // this is printed 2nd
	}
	Thiscalling(int no)
	{
		System.out.println("Child2 constructor "+no); // This will print 1st
	}
	public static void main(String[]args)
	{
		new Thiscalling();// this will goes to Thiscalling() method
	}

}
