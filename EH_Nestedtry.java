package pack3;
import java.util.Scanner;
import java.util.InputMismatchException;
public class EH_Nestedtry  
	{
		public static void main(String[] args)
		{
	        	try
	        	{// outer try block
	        		Scanner S1 = new Scanner(System.in);
        			System.out.println("Enter the no");
        			int a1=S1.nextInt(); // This will throw InputMismatch Exception if input is wrong
	        		try 
	        		{ // Inner try block
	        			int a = 10;
		        		int div = a / 0;  // This will throw ArithmeticException	
	        		}
	        		catch (ArithmeticException e) 
	        		{            // Outer catch block
	        			System.out.println("Caught exception in inner try-catch: "+e);
	        		}
	        	}
	        	catch (InputMismatchException e) 
	        	{ // Inner catch block
	               System.out.println("Caught InputMismatchException in outer try-catch: " + e);
	        	}
			}
		}
