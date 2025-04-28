package pack3;
public class Array_Exception1 {
	public static void main(String[]args)
	{
		//int a[]= {23,12};
		int a[]= new int[2];
		a[0]=23;
		a[1]=12;
		try
		{
			System.out.println("Try block"+a[2]);

		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
        System.out.println("Caught exception: " + e);
		}
        System.out.println("Program continues after exception handling.");

}
}
