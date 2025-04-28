package pack3;
abstract class Abstractclass2 // Abstract class
{
	abstract void login(); // Abstract methods
	abstract void logout();
}
public class AbstractClass extends Abstractclass2 // Abstraction performed using extends
{
	void login() // this login & logout method logic is used to keep within us not to share
	{
		String username = "abc";
		String password = "1234$";
		System.out.println("Enter username" + username); 
		System.out.println("Enter password" + password); 
		System.out.println("login inside"); 
	}
	void logout() 
	{
		System.out.println("Logout");
	}
	public static void main(String[] args) // main class
	{
		AbstractClass a = new AbstractClass();
		a.login();
		a.logout();
	}

}
