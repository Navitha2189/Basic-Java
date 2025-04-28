package pack3;

import java.util.Scanner;
public class AreaofRectangle 
{
	int l;//non static Global variable l,b,area
	int b;
	int area;
	public static void main(String[]args)
	{
		Scanner S1= new Scanner(System.in); //scanner class imported to get input of l, b
		System.out.println("Enter the Value of l "); 
		AreaofRectangle A1= new AreaofRectangle(); // step used to get the value of non static global variable
		A1.l=S1.nextInt();
		System.out.println("Enter the Value of b ");
		A1.b=S1.nextInt();
		A1.area = A1.l*A1.b;
		System.out.println("The Area of Rectangle is "+A1.area);
		
	}

}