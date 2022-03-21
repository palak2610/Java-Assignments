//6. Write an application that asks the user to enter two integers, obtains them from the user and
//displays the larger number followed by the words “is larger”. If the numbers are equal, print
//“These numbers are equal”

import java.util.*;
public class LargerOrEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b)
			System.out.println(a+" is larger then "+b+".");
		else if(a<b)
			System.out.println(b+" is larger then "+a+".");
		else
			System.out.println("Both are equal.");
	}

}
