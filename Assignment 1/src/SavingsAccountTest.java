//17. Create class SavingsAccount. Usea static variable annualInterestRate to store the annual interest
//rate for all account holders. Each object of the class contains a private instance variable
//savingsBalance indicating the amount the saver currently has ondeposit. Provide method
//calculateMonthlyInterest to calculate the monthly www.oumstudents.tk interest by multiplying
//the savingsBalance by annualInterestRate divided by 12 this interest should be added to
//savingsBalance. Provide a static method modifyInterestRate that sets the annualInterestRate to
//a new value. Write a program to test class SavingsAccount. Instantiate two savingsAccount
//objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set
//annualInterestRate to 4%, then calculate the monthly interest and print the new balances for
//both savers. Then set the annualInterestRate to 5%, calculate the next month’s interest and
//print the new balances for both savers

import java.util.*;

class SavingsAccount 
{
	 public static double annualInterestRate;
	 private double savingsBalance;
	 public SavingsAccount() 
	 {
		 annualInterestRate = 0.0;
		 savingsBalance = 0.0;
	 }
	 public SavingsAccount(double intRate, double savBal) 
	 {
		 annualInterestRate = intRate;
		 savingsBalance = savBal;
	 }
	 public double calculateMonthlyInterest() 
	 {
		 double intRate = (savingsBalance * annualInterestRate/12);
		 savingsBalance = savingsBalance + intRate;
		 return intRate;
	 }
	 public static void modifyInterestRate(double newInteresRate)
	 {
		 annualInterestRate = newInteresRate;
	 }
	 public void setSavingsBalance(double newBal) 
	 {
		 savingsBalance = newBal;
	 }
	 public double getSavingsBalance() 
	 {
		 return savingsBalance;
	 }
	 public double getAnnualInterestRate() 
	 {
		 return annualInterestRate;
	 }
}
public class SavingsAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sav1 = new SavingsAccount();
		SavingsAccount sav2 = new SavingsAccount();
		sav1.setSavingsBalance(2000);
		sav2.setSavingsBalance(3000);
		SavingsAccount.modifyInterestRate(0.04);
		sav1.calculateMonthlyInterest();
		sav2.calculateMonthlyInterest();
		System.out.printf("Balance for Saver1=%f\n",sav1.getSavingsBalance());
		System.out.printf("Balance for Saver2=%f\n",sav2.getSavingsBalance());
		SavingsAccount.modifyInterestRate(0.05);
		sav1.calculateMonthlyInterest();
		sav2.calculateMonthlyInterest();
		System.out.printf("Balance for Saver1=%f\n",sav1.getSavingsBalance());
		System.out.printf("Balance for Saver2=%f\n",sav2.getSavingsBalance());
	}

}
