//14. Create a class called Invoice that a hardware store might use to represent an invoice for an item
//sold at the store. An Invoice should include four pieces of information as instance variables‐a
//part number(type String),a part description(type String),a quantity of the item being purchased
//(type int) and a price per item (double). Your class should have a constructor that initializes the
//four instance variables. Provide a set and a get method for each instance variable. In addition,
//provide a method named getInvoice Amount that calculates the invoice amount (i.e., multiplies
//the quantity by the price per item), then returns the amount as a double value. If the quantity is
//not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0.
//Write a test application named InvoiceTest that demonstrates class Invoice’s capabilities.

import java.util.*;
class Invoice 
{
 private String partNumber;
 private String partDescription;
 private int quantity;
 private double price;
 public Invoice(String pNum, String pDesc, int qty, double prc) 
 {
	 if (qty > 0) 
		 quantity=qty; 
	 else 
		 quantity=0;
	 if (prc > 0.0) 
		 price=prc; 
	 else 
		 price=0;
 }

 public String getPartNum()
 {
	 return partNumber;
 }

 public String getPartDesc()
 {
	 return partDescription;
 }

 public int getQuantity()
 {
	 return quantity;
 }

 public double getPrice()
 {
	 return price;
 }

 public void setQuantity(int qty)
 {
	 if (qty > 0) 
	 {
		 quantity=qty;
	 }
	 else 
	 {
		 quantity=0;
	 }
 }

 public void setPrice(double prc)
 {
	 if (prc > 0.0) 
	 {
		 price=prc;
	 }
	 else 
	 {
		 price=0.0;
	 }
 }

 public double getInvoiceAmount()
 {
	 return (double)quantity*price;
 }
}

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PartNumber, PartDescription, Quantity and PricePerItem");
		String partNumber = sc.next();
		String partDesc = sc.nextLine();
		int qty = sc.nextInt();
		double price = sc.nextDouble();
		Invoice invoice = new Invoice(partNumber, partDesc, qty, price);
		System.out.printf("Invoice 1: %s\t%s\t%d\t$%.2f\n", invoice.getPartNum(),invoice.getPartDesc(), invoice.getQuantity(), invoice.getPrice());
	}

}
