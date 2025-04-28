package pack3;
class SK
{
void add()
{
	System.out.println("Print 1st method");
}
}

public class SuperKeyword extends SK
{
	void add()
	{
		super.add();
		System.out.println("2nd method");
		super.add();
	}
	public static void main(String[]args)
	{
		SuperKeyword a =new SuperKeyword();
				a.add();
		
	}

}
