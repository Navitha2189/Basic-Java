package pack3;
class Animal
{
	void eat()
	{
		System.out.println("Animal eats");
	}}
class dog extends Animal
{
	void barks()
	{
		System.out.println("Dog barks");
	}}
class cat extends Animal
{
	void meow()
	{
		System.out.println("cat meows");
	}}
public class Hierarchial 
{
	public static void main(String[]args)
	{
		cat c1=new cat();
		c1.meow();
		dog d1 = new dog();
		d1.barks();
		c1.eat();
	}
}
