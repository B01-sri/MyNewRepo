package com.technoelevate.exception;

public class BankAccount {

	double balance;
	double amount;
	public BankAccount(double balance) {
		this.balance = balance;
		
		
	}
	 public void withdraw(double amount) {
		 if(this.balance>=amount)
		 {
			 this.balance = this.balance - amount;
			 System.out.println("Amount is Successfully debited ");
			 System.out.println("Your Balance is" +this.balance);
		 }
		 else
		 { 
			throw new InsufficientBalanceException("Insufficient Balance Exception");
		 }
		 
		 
	 }
}
	


