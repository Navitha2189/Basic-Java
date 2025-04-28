package pack3;

public class Globalvariable
{
	static int x;
	int y;
	static void age()
	{
		x=100;
		x=x+50;
		System.out.println("Age is "+x);
	}
	void age2()
	{
		y=10;
		y=x*y;
		System.out.println("Value is "+y);
	}
	public static void main(String[] args) 
	{
		age();
		Globalvariable n = new Globalvariable();
		n.age2();
		
		// TODO Auto-generated method stub

	}



}
