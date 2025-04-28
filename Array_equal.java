package pack3;
import java.util.Arrays;
import java.util.Scanner;
public class Array_equal {
	public static void main(String[] args)
		{		
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter size of array");
			int size=s1.nextInt();
			int a1[] = new int[size];
			int a2[] = new int[size];
			System.out.println("Enter the array1");
			for(int i=0;i<size;i++)
			{	
				a1[i] =s1.nextInt();
				
			}
			System.out.println("Enter the array2");
			for(int i=0;i<size;i++)
			{	
				a2[i] =s1.nextInt();
				
			}
			boolean b1=Arrays.equals(a1,a2);
			if(b1==true)
			{
			System.out.println(b1);
			}
			else
			{
				System.out.println(b1);
			}
			}
	}
