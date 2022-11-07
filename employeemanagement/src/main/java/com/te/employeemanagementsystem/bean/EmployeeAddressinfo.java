package com.te.employeemanagementsystem.bean;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Entity
@Data

public class EmployeeAddressinfo implements Serializable {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer addId;
	private String addressType;
	private String houseNo;
	private String street;
	private String city;
	private String state;
	private String country;
	private Integer pincode;
	@ManyToOne(cascade = CascadeType.ALL)
	private EmployeePrimaryinfo primaryinfo; // need that pid column
}
