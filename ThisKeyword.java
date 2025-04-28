package pack3;

public class ThisKeyword {
	String name;
	int age;
	void add(String name,int age)
	{
		this.name = name;
		this.age =age;
	System.out.println("name " + name);
	System.out.println("age " + age);

	}
public static void main(String[]args)
{
	ThisKeyword t=new ThisKeyword();
	t.add("av", 10);
	System.out.println(t.name);
	System.out.println(t.age);

}
}
