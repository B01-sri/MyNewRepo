package com.te.springcore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeAddressTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
		Address address = (Address) context.getBean("address");
		System.out.println(address);

	}

}
