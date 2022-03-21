//9. The process of finding the largest value (i.e., the maximum of a group of values) is used
//frequently in computer applications. For example, a program that determines the winner of a
//sales contest would input the number of units sold by each sales person. The sales person who
//sells the most units wins the contest. Write a Java application that inputs a series of 10 integers
//and determines and prints the largest integer. Your program should use at least the following
//three variables:
//a. counter: A counter to count to 10 (i.e., to keep track of how many numbers have been input
//and to determine when all 10 numbers have been processed).
//b. number: The integer most recently input by the user. 
import java.util.*;
public class LargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in); 
		 int number=0, largest=0; 

		 for (int counter=0; counter<10; counter++){
		 System.out.printf("Enter Number "+counter+": " );
		 number=sc.nextInt(); 
		 if(largest>number)
			 largest = largest;
		 else
			 largest = number;
		 }

		 System.out.println("Largest value is "+ largest);
	}

}
