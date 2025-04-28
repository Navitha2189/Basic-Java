package pack3;

import java.util.Arrays;

public class Array_reverse {
	public static void main(String[]args)
	{
		int a1[]=new int[3];
		a1[0]=45;
		a1[1]=75;
		a1[2]=25;
		int a2[]=new int[a1.length];
		for(int i=0,j=2;i<a1.length;i++,j--)
		{
			a2[j]=a1[i];
		}
		System.out.println("input array "+Arrays.toString(a1));
		System.out.println("output array "+Arrays.toString(a2));
		
	}
}
