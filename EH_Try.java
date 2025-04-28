package pack3;
import java.util.Scanner;
import java.util.InputMismatchException;
public class EH_Try 
{
	public static void main(String[] args)
	{
		try 
		{// 1st exception  
        			Scanner S1 = new Scanner(System.in);
        			System.out.println("Enter the no");//  2nd exception
        			int a1=S1.nextInt(); 
        			System.out.println("enter the value of a ");
        			int a2=S1.nextInt();
        			int div = a2/0;
        			System.out.println(div);
        		} 
        		catch (InputMismatchException e) 
        		{
                System.out.println("Caught in 1st exception: " + e);
        		}
            catch (ArithmeticException e) 
            { 
            System.out.println("Caught in 2nd exception : " + e);
            }
}}