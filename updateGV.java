package pack3;

public class updateGV 
{
	static int x;
	int y;
	/*static void age()
	{
		x=100;
		x=x+50;
		System.out.println("Age is "+x);
	}*/
	public static void main(String[] args) 
	{
		x=50;//updated value of x from 0 to 50 directly without an object as it is a static Global variable
		System.out.println("Value of x= " +x);
		Globalvariable n = new Globalvariable();
		n.y = 100; // value of y is updated by creating an object as it is non static Global variable
		System.out.println("value of y= "+n.y);
	}

}
