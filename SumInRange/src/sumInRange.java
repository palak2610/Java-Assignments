import java.util.*;
public class sumInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			sum = sum + i;
		}
		System.out.println("The sum in the range " +  a + " to " + b +  " is " + sum);
	}

}
