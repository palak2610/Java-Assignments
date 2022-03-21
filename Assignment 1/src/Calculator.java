//5. Write an application that asks the user to enter two integers, obtains them from the user and
//prints their sum, product, difference and quotient (division).
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an operator: +, -, *, or /");
	    char operator = sc.next().charAt(0);
	    System.out.println("Enter the 2 numbers");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    switch (operator) {
	      case '+':
	        int add = a + b;
	        System.out.println(a + " + " + b + " = " + add);
	        break;
	      case '-':
	        int sub = a - b;
	        System.out.println(a + " - " + b + " = " + sub);
	        break;
	      case '*':
	        int mul = a * b;
	        System.out.println(a + " * " + b + " = " + mul);
	        break;
	      case '/':
	        int div = a / b;
	        System.out.println(a + " / " + b + " = " + div);
	        break;
	      default:
	        System.out.println("Wrong operator!");
	        break;
	    }	}

}
