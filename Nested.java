package pack3;

public class Nested {
	public static void main(String[]args)
	{
		int a=100;
		int b=200;
		if(a==200)
		{
			if(a>=150)
			{
				System.out.println("a is bigger "+a);
			}
			else
			{
				System.out.println("a is smaller "+a);
			}
		}
		else
		{
			System.out.println("b is bigger "+b);
		}
		
	}
}
