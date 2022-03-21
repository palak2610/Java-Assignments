// 2. Write a program that calculates and prints the product of three integers

import java.util.*;
public class ProductOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers to get the product");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("The product of "+a+" "+b+" "+c+" is "+a*b*c+".");
	}

}
