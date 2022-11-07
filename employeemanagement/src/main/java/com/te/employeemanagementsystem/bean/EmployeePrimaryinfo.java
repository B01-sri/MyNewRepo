package com.te.employeemanagementsystem.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data

public class EmployeePrimaryinfo implements Serializable {
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
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "primaryinfo")
	private List<EmployeeAddressinfo> addressinfos;

}
