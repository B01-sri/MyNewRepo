package com.technoelevate.exception;

public class InsufficientBalanceException extends RuntimeException {

	private String msg;



	public InsufficientBalanceException(String msg) {
		super(msg);//
		this.msg = msg;
	}
	


	@Override
	public String getMessage() {
		
		return this.msg;
	}
}