package pack3;
import java.util.Scanner;
class a
{
	void one()
	{
	System.out.println("one");
	}
}
class b extends a
{
	void two()
	{
		System.out.println("two");
	}
}
class c extends b
{
	int three;
}
public class Multilevel 
{
	public static void main(String[]args)
	{
		Scanner S1=new Scanner(System.in);
		c C1=new c();
		System.out.println("enter the value for three ");
		C1.three = S1.nextInt();
		C1.two();
		C1.one();
		S1.close();
		
	}
}
