package com.te.springboot.dto;

import java.util.List;

import com.te.springboot.entity.EmployeeEducationalInfo;
import com.te.springboot.entity.EmployeeSecondaryInfo;
import com.te.springboot.entity.EmployeeSkills;

import lombok.Data;

@Data
public class EmployeeDto  {
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
	
	private EmployeeSecondaryInfo secondaryinfo;
	private List<EmployeeEducationalInfo> educationalinfo;
	private List<EmployeeSkills> skills;
}
