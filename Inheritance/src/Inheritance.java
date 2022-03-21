class Animal
{  
	void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal
{  
	void bark(){System.out.println("barking...");}  
}  

class BabyDog extends Dog
{  
	void weep(){System.out.println("weeping...");}  
} 
class Cat extends Animal
{  
	void meow(){System.out.println("meowing...");}  
}  
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Single Inheritance");
		Dog d=new Dog();  
		d.bark();  
		d.eat(); 
		System.out.println();
		
		System.out.println("Multilevel Inheritace");
		BabyDog b=new BabyDog();  
		b.weep();  
		b.bark();  
		b.eat();  
		System.out.println();
		
		System.out.println("Hierarichal Inheritance");
		Cat c=new Cat();  
		c.meow();  
		c.eat();
		System.out.println();
	}

}

