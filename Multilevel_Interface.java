package pack3;
interface GrantParent_1
{
	void one();
}
interface Parent_3 extends GrantParent
{
	void two();
}
interface Parent_4 extends Parent_3 
{
	void three();
}
class child_2 implements Parent_3, Parent_4
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
}
public class Multilevel_Interface
{
	public static void main(String[]args)
	{
	child_2 m = new child_2();
	m.one();
	m.two();
	m.three();
	}
}

