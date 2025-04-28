package pack3;

public class StringReverse 
{
	public static void main(String[] args)
	{
		String a = "Reverse Input";
		String r ="";
		for(int i=0;i<a.length();i++)
		{
			char ch = a.charAt(i); //extracts each character
			r = ch+r;//adds each character in front of the existing string
		}
		System.out.println(r);
	}

}						
