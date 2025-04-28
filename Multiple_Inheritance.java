package pack3;
class GrandParent
{
	void one()
	{
		System.out.println("Print grant parent");
	}
}
class Parent1 extends GrandParent
{
	void one()
	{
		System.out.println("Print parent1");
	}
}
class Parent2 extends GrandParent
{
	void one()
	{
		System.out.println("Print parent2");
	}
}
public class Multiple_Inheritance extends Parent1, Parent2
{
	void one()
	{
		System.out.println("Print child");
	}
	public static void main(String[] args)
	{
	Multiple_Inheritance m = new Multiple_Inheritance;
	m.one();
	}
}