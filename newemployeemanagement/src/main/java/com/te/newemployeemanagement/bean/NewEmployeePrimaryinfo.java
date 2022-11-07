package com.te.newemployeemanagement.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.te.newemployeemanagement.bean.NewEmployeeAddressinfo;
import com.te.newemployeemanagement.bean.NewEmployeePrimaryinfo;

import lombok.Data;

@Entity
@Data
public class NewEmployeePrimaryinfo implements Serializable {

	@Id
	private Integer empId;
	private String empName;
	private Integer empAge;
	private String empDesignation;
	private String empBloodgrp;
	private String empEmailid;
	private String empDOB;
	private String empMartialStatus;
	private String empGender;
	private Integer empDeptno;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "newprimaryinfo")
	private List<NewEmployeeAddressinfo> newaddressinfos;

}
