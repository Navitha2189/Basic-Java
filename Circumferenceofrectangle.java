package pack3;
import java.util.Scanner;
public class Circumferenceofrectangle
{
	public static void main(String[]args)
	{
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter the value of l");
		double l=S1.nextDouble();
		System.out.println("Enter the value of b");
		double b=S1.nextDouble();
		double circum = 2*(l+b);
		System.out.println("Circumference of Rectangle = "+circum);
		S1.close();
	}

}
