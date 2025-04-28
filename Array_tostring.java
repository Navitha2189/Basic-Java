package pack3;
import java.util.Arrays;
public class Array_tostring
{
	public static void main(String[]args)
	{
		int age[] = new int[3];
		age[0]=15;
		age[1]=43;
		age[2]=42;
		String name[]= new String[3];
		name[0]="Kavi";
		name[1]="Navi";
		name[2]="Asha";
		Arrays.sort(age);
		System.out.println(Arrays.toString(age));
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		
	}

}
