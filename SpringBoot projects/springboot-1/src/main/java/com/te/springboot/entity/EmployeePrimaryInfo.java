package com.te.springboot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity

@Table(name = "employee_Primary_info")
public class EmployeePrimaryInfo {
	@Id
	private String empId;
	private String empName;
	private int empAge;
	private String empDesignation;
	private String empBloodGrp;
	private String empEmailId;
	private String empDob;
	private String empMartialStatus;
	private String empGender;
	private int empDeptNo;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "primaryinfo")
	private EmployeeSecondaryInfo secondaryinfo;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "primaryinfo")
	private List<EmployeeEducationalInfo> educationalinfo;

}