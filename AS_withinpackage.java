package pack3;
class AS
{public static void a1()
{
	System.out.println("Print Public Method");
}
protected static void b1()
{
	System.out.println("Print Protected Method");
}
private static void a()
{
	System.out.println("Print Private Method");
}
static void d()
{
	System.out.println("Print default Method");
}}
public class AS_withinpackage {

	public static void main(String[] args) {
		AS.a1();
		AS.b1();
		AS.a();
		AS.d();
	}

}
