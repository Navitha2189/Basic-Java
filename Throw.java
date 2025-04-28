package pack3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Throw {

	    public static void main(String args[]) throws InputMismatchException, ArithmeticException, InterruptedException
	    {
	    	Scanner S1=new Scanner(System.in);
	    	System.out.println("enter your age");
	    	int age =S1.nextInt();
	    	for(int i=0;i<3;i++)
	    	{
	    		System.out.println(i);
	    		Thread.sleep(2000);
	    	}
	    	if(age>18)
	    	{
		    	throw new InputMismatchException();
	        }
	    	else
	    	{
	    		throw new ArithmeticException();
	    	}
	    	
	        String str = null;
	        System.out.println(str.length());
	    
	    }
}

	
