package pack3;
class SuperCalling2
{
	SuperCalling2(int age)
	{
		System.out.println("This is Parent Age is "+age);
	}
}

public class SuperCallingPara extends SuperCalling2
{
	SuperCallingPara(String name,int number)
	{
		super(10);
		System.out.println("Child class Prints name & number &also age from parent "+ name + number);
	}
	public static void main(String[]args)
	{
		new SuperCallingPara("Nabc",4567);
	}
}
