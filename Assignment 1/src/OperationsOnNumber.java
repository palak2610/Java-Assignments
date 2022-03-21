//7. Write an application that inputs three integers from the user and displays the sum, average,
//product, smallest and largest of the numbers
import java.util.*;
public class OperationsOnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int smallest=0, largest=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b)
			largest = a;
		else
			largest = b;
		if(a<b)
			smallest = a;
		else
			smallest = b;
		System.out.println("The sum of "+a+" "+b+" is "+ (a+b));
		System.out.println("The average of "+a+" "+b+" is " + (a+b)/2);
		System.out.println("The product of "+a+" "+b+" is "+ a*b);
		System.out.println("The smallest number is "+smallest);
		System.out.println("The largest number is "+largest);
	}

}
