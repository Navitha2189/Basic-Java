package pack3;
class Animal1
{
	void move() // Base class
	{ 
		System.out.println( "Animal is moving."); 
	}
	void eat() 
	{ 
	 System.out.println("Animal is eating."); 
	 }}
class Dog1 extends Animal1
{@Override 
 void move()
 { 
     System.out.println("Dog is running.");// move method from Base class is overriden in this method
 }
 void bark() 
 { 
	 System.out.println("Dog is barking."); 
	 }}
public class Methodoverriding 
{
	public static void main(String[]args)
	{
		 Dog1 d = new Dog1();
	     d.move(); // Output: Dog is running.
	     d.eat(); // Output: Animal is eating.
	     d.bark(); // Output: Dog is barking.
	}

}
