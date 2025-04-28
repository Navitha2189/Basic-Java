package pack3;
interface GrantParent
{
	void one();
}
interface Parent_1 extends GrantParent
{
	void two();
}
interface Parent_2 extends GrantParent 
{
	void three();
}
class child_1 implements Parent_1, Parent_2
{
	public void one()
	{
		System.out.println("Print grantparent");
	}
	public void two()
	{
		System.out.println("Print Parent1");
	}
	public void three()
	{
		System.out.println("Print Parent2");
	}
	public void four()
	{
		System.out.println("Print child");
	}
}
public class Multiple_Interface
{
	public static void main(String[]args)
	{
	child_1 m = new child_1();
	m.one();
	m.two();
	m.three();
	m.four();
	}
}
