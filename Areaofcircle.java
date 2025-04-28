package pack3;
import java.util.Scanner;
public class Areaofcircle
{
	static double pi;//Global variable
	static int r;
	void area()
	{
	double area=pi*r*r;
	System.out.println("Area of circle = "+ area);
	}
	public static void main(String[]args)
	{
		System.out.println("enter the value of pi is ");
		Scanner S1=new Scanner(System.in);
		pi=S1.nextDouble();
		System.out.println("enter the value of r is ");
		r=S1.nextInt();
		Areaofcircle a1= new Areaofcircle();	
		a1.area();
		S1.close();
}
}
