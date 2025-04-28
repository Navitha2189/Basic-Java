package pack3;
class SuperCalling1
{
	SuperCalling1()
	{
	System.out.println("Parent class constructor Calling using Super calling Method");
	}
}
public class SuperCalling extends SuperCalling1
{
	SuperCalling()
	{
	super();
	System.out.println("Child class calling parent using super");
	}

	public static void main(String[] args) 
	{
		new SuperCalling();
	}

}
