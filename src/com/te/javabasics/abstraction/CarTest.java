package com.te.javabasics.abstraction;

public class CarTest {

	public static void main(String[] args) {
		Car car = CarFactory.getCar();
	 MainDriver m = new MainDriver();
		m.driver(car);

	}

}
