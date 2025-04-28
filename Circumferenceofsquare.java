package pack3;
import java.util.Scanner;
public class Circumferenceofsquare {
	int a;
	int circum = 4*a;
	void circumference()
	{
		int circum =4*a;
		System.out.println("The Circumference of square is "+circum);		
		
	}
	public static void main(String[]args)
	{
		Scanner S1=new Scanner(System.in);
		System.out.println("Eneter the value of a ");
		Circumferenceofsquare C1= new Circumferenceofsquare();
		C1.a=S1.nextInt();
		C1.circumference();	
		
	}

}
