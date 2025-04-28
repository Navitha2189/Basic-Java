package pack3;
class Mom
{
	String name ="Bommi";
	int Money = 20000;
}
class Daughter extends Mom
{
}
public class Singleinherit 
{
	public static void main(String[]args)
	{
		Daughter b1=new Daughter();
		System.out.println("Name of the Mom is "+b1.name);
		System.out.println("Money inherited from Mom is "+b1.Money);
	}

}
