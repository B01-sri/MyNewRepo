package com.te.newspringcore.bean;

import java.io.Serializable;

import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class NewAddress implements Serializable {

	private String hNo;
	private String street;
	private String country;

}
