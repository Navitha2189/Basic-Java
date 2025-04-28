package pack3;

public class Nonstatic1 
{
	void call1()
	{
		System.out.println("Hi this is one non static method");
	}
public static void main(String[] args)
{
	Nonstatic1 n= new Nonstatic1();
	n.call1();
}
}
