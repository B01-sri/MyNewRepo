package com.restaurant.menu;

public class RestaurantException extends Exception{
	String msg;
	public RestaurantException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.msg;
	}
}
