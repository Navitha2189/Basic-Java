package pack3;
import java.util.Scanner;
public class Circumoftriangle 
{
		public static void main(String[]args)
		{
			Scanner S1=new Scanner(System.in);
			System.out.println("Enter the value of a");
			double a=S1.nextDouble();
			System.out.println("Enter the value of b");
			double b=S1.nextDouble();
			System.out.println("Enter the value of c");
			double c=S1.nextDouble();
			double circum= a+b+c;
			System.out.println("Circumference of Triangle = "+circum);
			S1.close();
		}

	}
