//19. a. Create a super class called Car. The Car class has the following fields and methods. ◦intspeed;
//◦doubleregularPrice; ◦Stringcolor; ◦doublegetSalePrice();
//b. Create a sub class of Car class and name it as Truck. The Truck class has the following fields
//and methods. ◦intweight;
//◦doublegetSalePrice();Ifweight>2000,10%discount.Otherwise,20%discount.
//c.Create a subclass of Car class and name it as Ford. The Ford class has the following fields and
//methods ◦intyear; ◦intmanufacturerDiscount; ◦doublegetSalePrice();
//FromthesalepricecomputedfromCarclass,subtractthemanufacturerDiscount.
//d.Create a subclass of Car class and name it as Sedan. The Sedan class has the following fields
//and methods. ◦intlength;
//◦doublegetSalePrice();//Iflength>20feet,5%discount,Otherwise,10%discount.
//e.Create MyOwnAutoShop class which contains the main() method. Perform the following
//within the main() method. ◦Create an instance of Sedan class and initialize all the fields with
//appropriate values. Use super(...) method in the constructor for initializing the fields of the
//superclass. ◦Create two instances of the Ford class and initialize all the fields with appropriate
//values. Use super(...) method in the constructor for initializing the fields of the super class.
//www.oumstudents.tk ◦Create an instance of Car class and initialize all the fields with
//appropriate values. Display the sale prices of all instance.
import java.util.*;

class Car 
{
	 private int speed;
	 private double regularPrice;
	 private String color;

	 public Car (int Speed,double regularPrice,String color) 
	 {
		 this.speed = Speed;
		 this.regularPrice = regularPrice;
		 this.color = color;
	 }
	 public double getSalePrice() 
	 {
		 return regularPrice;
	 }
}
class Truck extends Car 
{
	 private int weight;
	 public Truck (int Speed,double regularPrice,String color, int weight) 
	 {
		 super(Speed,regularPrice,color);
		 this.weight = weight;
	 }
	 public double getSalePrice() 
	 {
		 if (weight > 2000)
		 {
			 return super.getSalePrice() - (0.1 * super.getSalePrice());	
		 }
		 else 
		 {
			 return super.getSalePrice();
		 }
	 }
}
class Ford extends Car 
{
	 private int year;
	 private int manufacturerDiscount;
	 public Ford (int Speed,double regularPrice,String color, int year, int manufacturerDiscount) 
	 {
		 super (Speed,regularPrice,color);
		 this.year = year;
		 this.manufacturerDiscount = manufacturerDiscount;
	 }
	 public double getSalePrice() 
	 {
		 return (super.getSalePrice() - manufacturerDiscount);
	 }
}
class Sedan extends Car 
{
	 private int length;
	 public Sedan (int Speed,double regularPrice,String color, int length) 
	 {
		 super (Speed,regularPrice,color);
		 this.length = length;
	 }
	 public double getSalePrice() 
	 {
		 if (length > 20) 
		 {
			 return super.getSalePrice() - (0.05 * super.getSalePrice());
		 }
		 else 
		 {
			 return super.getSalePrice() - (0.1 * super.getSalePrice());
		 }
	 }
}
public class MyOwnAutoShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan mySedan = new Sedan(160, 20000, "Red", 10);
		Ford myFord1 = new Ford (156,4452.0,"Black",2005, 10);
		Ford myFord2 = new Ford (155,5000.0,"Pink",1998, 5);
		Car myCar = new Car (555, 56856.0, "Red");
		System.out.printf("Sedan Price %.2f\n", mySedan.getSalePrice());
		System.out.printf("Ford1 Price %.2f\n", myFord1.getSalePrice());
		System.out.printf("Ford2 Price %.2f\n", myFord2.getSalePrice());
		System.out.printf("Car Price %.2f\n", myCar.getSalePrice());
	}

}
