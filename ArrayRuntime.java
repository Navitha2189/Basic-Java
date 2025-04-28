package pack3;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayRuntime {
	public static void main(String[] args)
	{		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size[] = new int[s1.nextInt()];
		for(int i=0;i<size.length;i++)
		{	
			System.out.println("The rollno of "+ i);
			size[i] = s1.nextInt();
		}
		System.out.println("The rollno of "+ Arrays.toString(size));
		s1.close();
		}
}
