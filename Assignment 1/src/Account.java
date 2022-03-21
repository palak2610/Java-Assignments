//13. Create a class Account to provide a method called debit that withdraws money from an
//Account. Ensure that the debit amount does not exceed the Account’s balance. If it does, the
//balance should be left unchanged and the method should print a message indicating ―Debit
//amount exceeded account balance.

import java.util.*;
public class Account {

	 private double balance;
	 public Account(double initialBalance) {
		 if (initialBalance > 0.0) balance=initialBalance;
	 }

	 public void credit(double amount){
		 balance=balance+amount;
	 }

	 public void debit(double amount){
		 balance=balance-amount;
	 }

	 public double getBalance(){
		 return balance;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the initial balance of your account : ");
		double balance = sc.nextDouble();
		Account acc1 = new Account (balance);
		System.out.printf( "Account1 balance: $%.2f\n", acc1.getBalance() );
		System.out.print( "Enter debit amount for account1: " );
		double debitAmount = sc.nextDouble();
		System.out.printf( "\nSubtracting %.2f from account1 balance\n\n", debitAmount );
		if (acc1.getBalance()>=debitAmount) 
		{
			acc1.debit( debitAmount );
			System.out.printf( "Account1 balance: $%.2f\n", acc1.getBalance() );
		}
		else 
		{
			System.out.printf("!!! Debit amount exceeded account balance!!!\n\n");
		}
	}

}
