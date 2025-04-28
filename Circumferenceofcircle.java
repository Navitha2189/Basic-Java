package pack3;
import java.util.Scanner;
public class Circumferenceofcircle
{
	final double pi = 3.14;
	double r;
	void circumference()
	{
		double circum = 2*pi*r;
		System.out.println("Circumference of circle is "+circum);
	}
	public static void main(String[]args)
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println("enter the value of r");
		Circumferenceofcircle C1 = new Circumferenceofcircle();
		C1.r= S1.nextDouble();
		C1.circumference();
		S1.close();
	}

}
