import java.util.*;
public class eligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight of the Person");
		int weight = sc.nextInt();
		System.out.println("Enter the age of the Person");
		int age = sc.nextInt();
		if(age>=20)
		{
			if(weight>=40)
			{
				System.out.println("Eligible");
			}
			else 
			{
				System.out.println("Not Eligible");
			}
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
	

}
