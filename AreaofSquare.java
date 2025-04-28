package pack3;
import java.util.Scanner;
public class AreaofSquare
{
	static int S;
	static int area;
	public static void main(String[]args)
	{
		Scanner S1= new Scanner(System.in);
		System.out.println("Enter the Value of S ");
		S=S1.nextInt();
		area = S*S;
		System.out.println("The Area of Square is "+area);
		
	}

}
