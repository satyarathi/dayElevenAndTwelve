package com.three;

public class Account {

	private double balance;
	
	public Account(double currentBalance) {
		if(currentBalance> 0.0)
		balance = currentBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void Credit(double amount) {
		balance = balance + amount;
	}

	public void Debit(double debitAmount) {
		if (debitAmount>balance) {
			debitAmount = 0.0;
			System.out.println("Debit amount is more than Account Balance");
		}
		balance = balance- debitAmount;
	}

}


