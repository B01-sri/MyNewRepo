package com.te.springboot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
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
	@JsonManagedReference
	private EmployeeSecondaryInfo secondaryinfo;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "primaryinfo")
	@JsonManagedReference
	private List<EmployeeEducationalInfo> educationalinfo;

	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "primaryinfo")
	@JsonIgnore
	private List<EmployeeSkills> skills;
}
