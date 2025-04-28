package pack3;

public class Finalvariable 
{
	static final int a=3;
	final double b=10;
	void add()
	{
		int a = 5;
		System.out.println(a);
	}
	public static void main(String[]args)
	{
		
		Finalvariable F = new Finalvariable();
		F.add(); // displaying the non static value of a from add method
		System.out.println(a); //displaying the final variable from declared global variable
		Finalvariable F1=new Finalvariable();
		System.out.println(F1.b); // dispalying the non static final variable from Global

	}
}
