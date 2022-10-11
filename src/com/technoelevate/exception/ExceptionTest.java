package com.technoelevate.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		BankAccount bankaccount = new BankAccount(50000d);
		
			try {
				bankaccount.withdraw(60000d);
			} catch (Exception e) {
			
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}

	}
}
