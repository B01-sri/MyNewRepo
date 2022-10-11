package com.technoelevate.exception;

public class NotEligibleException extends Exception {
	private String msg;
	public NotEligibleException(String msg) {
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		
		return this.msg;
	}
	
	
	

}
