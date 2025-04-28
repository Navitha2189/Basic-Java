package pack3;

public class ConstructorOverloading 
{
	ConstructorOverloading()
	{
		int a=2;
		System.out.println("1st constructor"+a);
	}
	ConstructorOverloading(String a)
	{
		System.out.println("2nd constructor with string");
	}
	public static void main(String[]args)
	{
		ConstructorOverloading c1 = new ConstructorOverloading();
	/*	new ConstructorOverloading();
		new ConstructorOverloading("a");*/
		ConstructorOverloading c2 = new ConstructorOverloading("a");

	}
}
