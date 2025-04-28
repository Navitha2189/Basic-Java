package pack3;

public class Methodoverloading
{
	static void sum(int a, double b)
	{
	double add;
	System.out.println(a+b);
	}
	static void sum(int a, int b, int c)
	{
		System.out.println(a*b*c);
	}
	void show(String a, String b)
	{
		System.out.println(a+b);
	}
	void show(String a, String b, int c)
	{
		System.out.println(a+b+c);
	}	
	public static void main(String[] args) 
	{
		sum(897,1.10);
		sum(5,5,5);
		Methodoverloading n= new Methodoverloading();
		n.show("Hi, this is non Static"," Method overloading");
		n.show("with 3 Parameters"," abc ",123);

	}

}
