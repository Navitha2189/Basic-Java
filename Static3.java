package pack3;

public class Static3 
{ 
	static void login(int phno)
	{
	System.out.println("enter your phone number to login:" +phno);
	}
	static void display(String name, String pswd)
	{
	System.out.println("My name is : "+name +" My password is "+pswd);
	}
	static void cal(int a, double b)
	{
	double sum= a+b;
	System.out.println(sum);
	}
	public static void main(String[]args)
	{
		login(123445678);
		display("Masha","Pssword1");
		cal(2345,167.78);
	}

}
