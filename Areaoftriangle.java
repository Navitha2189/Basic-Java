package pack3;
import java.util.Scanner;
public class Areaoftriangle
{
	public static void main(String[]args)
	{
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter the value of b");
		double b=S1.nextFloat();
		System.out.println("Enter the value of h");
		double h=S1.nextFloat();
		double area= 0.5*b*h;
		System.out.println("Area of Triangle = "+area);
		S1.close();
	}

}
