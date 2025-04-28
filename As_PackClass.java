package pack3;
class A1
{
	static void display()
	{
	System.out.println("This is default class");
	}
}
public class As_PackClass 
{
	static void display1()
	{
	System.out.println("This is public class");
	}
	public static void main(String[] args)
	{
		A1.display();
		As_PackClass.display1();
	}

}
/*protected class A2 //  this is not allowed in Java
{
	static void display2()
	{
	System.out.println("This is protected class");
	}
}
private class A3
{
	static void display3()
	{
	System.out.println("This is private class");
	}
}*/