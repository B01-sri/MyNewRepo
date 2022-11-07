package com.te.newspringcore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class NewEmployeeAddress {

	public static void main(String[] args) {
		
			ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
			NewEmployee newemployee = (NewEmployee) context.getBean("newemployee");
			System.out.println(newemployee);
//			NewAddress newaddress = (NewAddress) context.getBean("newaddress");
//			System.out.println(newaddress);
//			NewAddress newaddress1 = (NewAddress) context.getBean("newaddress1");
//			System.out.println(newaddress1);


		}


	}


