package com.te.spring_rest.exception;

public class EmployeeNotPresentException extends RuntimeException {

	private String message;

	public EmployeeNotPresentException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

}
