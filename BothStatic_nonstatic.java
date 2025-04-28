package pack3;;

public class BothStatic_nonstatic
{
	static void name(String name)
	{
		System.out.println("This is static method "+name);
	}
	void age(int age)
	{
	System.out.println("This is non static method "+age);
	}
public static void main(String[] args)
{
	name("Mani");
	BothStatic_nonstatic n= new BothStatic_nonstatic();
	n.age(25);
}
}