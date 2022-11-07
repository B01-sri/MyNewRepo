package com.te.springboot.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data

@Table(name = "employee_Secondary_info")
public class EmployeeSecondaryInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int secondaryId;
	private String empHeight;
	private String empPanNo;
	private String empDoj;
	private String empIdentificationMark;
	private String empMotherName;
	private String empFatherName;
	private String empPassportNo;
	private String empManager;

	@OneToOne(cascade = CascadeType.ALL)
	private EmployeePrimaryInfo primaryinfo;
}
