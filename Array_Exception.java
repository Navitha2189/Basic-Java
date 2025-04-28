package pack3;
import java.util.Scanner;
public class Array_Exception {
	public static void main(String[]args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the sise ");
		int Sise[]=  new int[s1.nextInt()];
		double sum=0;
		System.out.println("enter the digits ");
		for(int i=0;i<=Sise.length;i++)
		{
			Sise[i]=s1.nextInt();
			sum=sum+Sise[i];
		}
		System.out.println("sum "+sum);
		try
		{
			System.out.println("Try block");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
        System.out.println("Caught exception: " + e);
		}
}}
