



package com.technoelevate.exception;

public class VoteTest {

	public  void checkAge(int age) throws NotEligibleException{
		if(age>=18) {
			System.out.println("You are Eligible to cast the Vote");
		}
		else {
			throw new NotEligibleException("You are Not Eligible to cast the vote");
		}
	}
}
	




	
