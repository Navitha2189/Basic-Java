package pack3;
import java.util.Arrays;
public class Array_Anagram
{
	public static void main(String[]args)
	{
		String s1="act";
		String s2="cat";
		if(s1.length()==s2.length())
		{
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean b1=Arrays.equals(c1, c2);
			System.out.println(b1);
			if(b1==true)
			{
				System.out.println("Its a anagram");
	
			}
			else
			{			
				System.out.println("Its not an anagram");
			}
		}
		else
		{
			System.out.println("Its not an anagram");
		}

		}
}

//wat is te initial size of the Given string
// tere is no predefined size 
