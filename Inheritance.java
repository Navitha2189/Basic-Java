package pack3;
class one
{
static void add()
{
	int x =10;
	int y =5;
	int sum=x+y;
	int sub = x-y;
	System.out.println("sum is "+sum);
	System.out.println("sub is "+sub);
}}
class two extends one
{
	static void sub()
	{
}
	}
public class Inheritance 
{
	public static void main(String[] args)
	{
	two b1= new two(); 
	b1.add();
	b1.sub();
}
}
