/* 1.Abstract Keyword
 * 2.Abstract and non abstract methods
 * 3.Constructirs
 * 4. final methods
		*/

abstract class Animal
{
	abstract void display();
	void getColor()
	{
		System.out.println("Non Abstract");
	}
}
public class Dog extends Animal {
	void display()
	{
		System.out.println("Abstract Method IMplementation");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.display();
		d.getColor();
		
	}

}
