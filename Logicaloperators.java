package pack3;

public class Logicaloperators {
	public static void main(String[]args)
	{
		int a=10;
		int b=20;
		int c=30;
		int sum=a+b+c;
		int Div=(a+b)%c;
		int Mul=a*b*c;
		boolean d=true;
		boolean e=false;
		if(d=true)
		{
			if(a==10&&b==20)
			{
			System.out.println("Print sum = "+sum);
			}
			else
			{
			System.out.println("Print e "+e);
			}
		}
		if(d!=false)
			{
			if(a<=10||b>20)
			{
			System.out.println("Print Mul = "+Mul);
			}
			}
		if(d=true&&e!=true)
		{
			System.out.println("Print Div = "+Div);
		}
		else
			{
			System.out.println("Print Nothing");
			}
}
}