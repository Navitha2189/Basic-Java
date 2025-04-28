package pack3;

public class StringFunction 
{
	public static void main(String []args)
	{
	String a = "string program";
	System.out.println("Uppercase = "+a.toUpperCase());
	System.out.println("Lowercase = "+a.toLowerCase());
	System.out.println("Length of a = "+a.length());
	System.out.println("3rd character of a = "+a.charAt(3));
	String a1="   This is a    String    Program    ";
	System.out.println(a1);
	System.out.println("'"+a1.trim()+"'");
	String s="This is a ";
	System.out.println("concatenation = "+s.concat(a));
	System.out.println("Contains = "+a.contains("This"));


	}
}