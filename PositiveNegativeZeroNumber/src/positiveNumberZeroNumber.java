import java.util.*;
public class positiveNumberZeroNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number  = sc.nextInt();
		if(number > 0)
		{
			System.out.println("Positive Number");
		}
		else if(number < 0)
		{
			System.out.println("Negative Number");
		}
		else if (number == 0)
		{
			System.out.println("Zero Number");
		}
	}
	

}
