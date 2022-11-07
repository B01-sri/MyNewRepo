package com.te.springcore.bean;

import java.io.Serializable;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class Address implements Serializable {
	private String hNo;
	private String street;
	private String country;

}
