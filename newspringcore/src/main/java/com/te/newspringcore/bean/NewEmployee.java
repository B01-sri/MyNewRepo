package com.te.newspringcore.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor 
@Setter
@ToString
public class NewEmployee implements Serializable {

	private int empId;
	private String eName;
	private NewAddress newaddress1;

	
	

}
