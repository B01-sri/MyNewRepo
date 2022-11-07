package com.te.newemployeemanagement.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.te.newemployeemanagement.bean.NewEmployeeAddressinfo;
import com.te.newemployeemanagement.bean.NewEmployeePrimaryinfo;

import lombok.Data;

@Entity
@Data
public class NewEmployeeAddressinfo implements Serializable {

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
	private NewEmployeePrimaryinfo newprimaryinfo; // need that pid column
}
