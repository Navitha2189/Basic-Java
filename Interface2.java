package pack3;
interface GrandParent1
{
	void one();
}
interface Parent3 
{
	void two();
}
class child implements Parent3, GrandParent1
{
	public void one()
	{
		System.out.println("Print GrantParent");
	}
	public void two()
	{
		System.out.println("Print Parent");
	}}
public class Interface2
{
	public static void main(String[]args)
	{
	child m = new child();
	m.one();
	m.two();
	}
}
