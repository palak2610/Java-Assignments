//8. Write an application that reads two integers, determines whether the first is a multiple of the
//second and print the result.
import java.util.*;
public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int rem = a%b;
		if(rem == 0)
			System.out.println(a+ " is a multiple of "+b);
		else
			System.out.println(a+ " is not a multiple of "+b);
	}

}
