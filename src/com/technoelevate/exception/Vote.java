package com.technoelevate.exception;

import java.util.Scanner;
//Checked Exception
public class Vote {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Age");
	int age = scanner.nextInt();
	VoteTest vTest = new VoteTest();
	
	try {
		vTest.checkAge(age);
	} catch (NotEligibleException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
	
	
	
	
	
	
	

	}

}
