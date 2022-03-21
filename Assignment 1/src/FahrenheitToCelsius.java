//3. Write a program that converts a Fahrenheit degree to Celsius

import java.util.*;
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 double celsius;
		 double tempInFahrenheit = 0.0;

		 celsius = (tempInFahrenheit - 32.0) * 5.0 / 9.0;
		 System.out.println("Enter the fahrenheit value");
		 tempInFahrenheit = sc.nextDouble();

		 System.out.printf("The celsius value of " + tempInFahrenheit+" is "+ celsius);
	}

}
