//15. Create a class called Employee that includes three pieces of information as instance variables—a
//first name (typeString), a last name (typeString) and a monthly salary (double). Your class should
//have a constructor that initializes the three instance variables. Provide a set and a get method
//for each instance variable. If the monthly salary is not positive, set it to 0.0. Write a test
//application named EmployeeTest that demonstrates class Employee’s capabilities. Create two
//Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise
//and display each Employee’s yearly salary again.

import java.util.*;
class Employee 
{
	 private String firstName;
	 private String lastName;
	 private double salary;
	 public Employee(String fName, String lName, double sal) 
	 {
			firstName =fName; 
			lastName = lName;
		 if (sal > 0.0) 
		 {
			 salary=sal;
		 }
		 else 
		 {
			 salary=0.0;
		 }
	 }
	 //set methods
	 public String getFirstName()
	 {
		 return firstName;
	 }
	 public String getLastName()
	 {
		 return lastName;
	 }
	 public double getSalary()
	 {
		 return salary;
	 }
	 public void setFirstName(String fName)
	 {
		 if (fName != null)
		 firstName = fName;
	 }

	 public void setLastName(String lName)
	 {
		 if (lName != null)
		 lastName = lName;
	 }

	 public void setSalary(double sal)
	 {
		 if (sal > 0.0)
		 {
			 salary = sal;
		 }
		 else 
		 {
			 salary = 0.0;
		 }
	 }
}
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name, last name and salary");
		String fName = sc.next();
		String lName = sc.next();
		double sal = sc.nextDouble();
		Employee emp = new Employee(fName, lName, sal);
		System.out.println();
		System.out.println("Salary before the 10% raise");
		System.out.println(emp.getFirstName()+" "+emp.getLastName()+" "+emp.getSalary());
		emp.setSalary( (.1*emp.getSalary())+emp.getSalary());
		System.out.println();
		System.out.println("Salary after the 10% raise");
		System.out.println(emp.getFirstName()+" "+emp.getLastName()+" "+ emp.getSalary());

	}

}
