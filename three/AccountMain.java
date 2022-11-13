package com.three;
import java.util.Scanner;

public class AccountMain {
public static void main(String[] args) {
		
		Account account = new Account(800);
		
		System.out.printf("Account balance : Rs %.2f\n", account.getBalance());
	
		Scanner input = new Scanner ( System.in );
		double withdrawAmount;
		System.out.print("Enter the Debit Amount :");
		withdrawAmount = input.nextDouble();
		
		account.Debit(withdrawAmount);

		System.out.printf("Current balance is RS %.2f\n", account.getBalance());

}
	
	
	
}
