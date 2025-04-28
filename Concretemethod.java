package pack3;
abstract class Abstractclass3
{
	abstract void add();
	//abstract void sub();
	void login()
	{
		System.out.println("login using the no");
	}
}
public class Concretemethod extends Abstractclass3
{
	void add()
	{
		int x=10;
		int y = 20;
		int sum=x+y;
		System.out.println("sum = "+sum);
	}
	public static void main(String[] args)
	{
		Concretemethod c=new Concretemethod();
c.add();
c.login();
}
}
