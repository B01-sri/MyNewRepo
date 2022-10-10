package com.te.javabasics.abstraction;

import java.util.Scanner;

public class CarFactory {

public static Car getCar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Car name:");
		String carName = sc.next();
	if(carName.equalsIgnoreCase("audi"))
	{
		return new Audi();
	}else if(carName.equalsIgnoreCase("bmw"))
	{
	return new Bmw();
	}
	return null;

}
}
