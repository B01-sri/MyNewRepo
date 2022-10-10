package com.te.javabasics.abstraction;

public interface Car {
	void accelerator();
	 void brake();
	 void gear();
	 void gps();
     default void carPlay() {
	}
}
