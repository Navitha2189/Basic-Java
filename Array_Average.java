package pack3;

public class Array_Average {
	public static void main(String[]args)
	{
	
		int[] a=new int[3];
		a[0] =10;
		a[1]=20;
		a[2]=30;
		int sum=0;
		double avg = 0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a[i];
			avg=sum/a.length;

		}
		System.out.println("sum "+sum);
		System.out.println("avg "+avg);
	}

}
