package pack3;
class Animal2
{
	final void move() // Base class
	{ 
		System.out.println( "Animal is moving."); 
	}
}
public class Methodoverriddingfinal extends Animal2
{
	void move()
	 { 
	     System.out.println("Dog is running.");// move method from Base class has to overriden in this method
	 }
	public static void main(String[]args)
	{
		Methodoverriddingfinal d = new Methodoverriddingfinal();
	     d.move();
	     d.move1();
	}

}

