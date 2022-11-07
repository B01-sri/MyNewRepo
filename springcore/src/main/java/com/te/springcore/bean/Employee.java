package com.te.springcore.bean;

import java.io.Serializable;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class Employee implements Serializable {
	private int empId;
	private String eName;
	private Address address;


}
