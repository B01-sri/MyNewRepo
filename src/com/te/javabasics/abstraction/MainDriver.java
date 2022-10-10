package com.te.javabasics.abstraction;

import java.util.Scanner;

public class MainDriver {

	public void driver(Car car) {
		car.accelerator();
		car.brake();
		car.gear();
		car.gps();
		car.carPlay();
	}

}
