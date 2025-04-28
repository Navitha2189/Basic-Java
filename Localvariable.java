package pack3;

public class Localvariable 
{
	static void age()
	{
		int x=0;
		x=x+50;
		System.out.println("Age is "+x);
	}
	void age2()
	{
		int x=25;
		int y=50;
		x =x*y;
		System.out.println("Value is "+x);
	}

	public static void main(String[] args) 
	{
		age();
		Localvariable n = new Localvariable();
		n.age2();
		
		// TODO Auto-generated method stub

	}

}
