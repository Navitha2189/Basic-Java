package pack3;
public class AS_withinclass {
private void a()
{
	System.out.println("This is private class");
}
public void b()
{
	System.out.println("This is public method");

}
protected void c()
{
	System.out.println("This is protected method");

}
 static void d()
{
	System.out.println("This is default method");

}
	public static void main(String[] args) {
		AS_withinclass a1=new AS_withinclass();
		a1.a();
		a1.b();
		a1.c();
		d();
	}

}
