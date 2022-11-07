package com.te.springboot.entity;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data

@Table(name = "employee_Educational_info")
public class EmployeeEducationalInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int educationId;
	private String empQualification;
	private String empMarks;
	private int empYop;
	private String empBoard;
	private String empInstituteName;
	@ManyToOne(cascade = CascadeType.ALL)
	private EmployeePrimaryInfo primaryinfo;

}
