package pack3;
public class SIIB {
	static
	{
		System.out.println("display siib before Main Maethod");
	}
	{
		System.out.println("This is iib Method before Constructor");
	}
	SIIB()
	{
		int a=2;
		System.out.println("Constructor"+a);
	}
	public static void main(String[] args) {
		System.out.println("This is main Method");
		new SIIB();
	}
}
