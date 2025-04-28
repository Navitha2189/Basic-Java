package pack3;
public class StringEquals {
	public static void main(String[] args)
	{
	String a = "Welcome";
	String a1= "Java";
	boolean b1=a1.equals(a);
	System.out.println(b1);
	System.out.println(a1.equals("Java"));
	boolean b2=a.equalsIgnoreCase("welcome");// it ignores the upper or lower cases 
	System.out.println(b2);
	}

}
