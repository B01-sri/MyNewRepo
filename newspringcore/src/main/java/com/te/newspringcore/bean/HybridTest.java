package com.te.newspringcore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HybridTest {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("hybrid.xml");
//	Car car = context.getBean(Car.class);
	Car car = context.getBean("car1", Car.class);
	System.out.println(car);
	}

}
