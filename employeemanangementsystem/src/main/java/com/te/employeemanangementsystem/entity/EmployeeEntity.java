package com.te.employeemanangementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class EmployeeEntity {
	@Id
	@Column(name = "emp_Id")
	private String empId;
	@Column(name = "emp_Name")
	private String ename;
	@Column(name = "emp_EmailId")
	private String emailId;
	@Column(name = "emp_Password")
	private String password;

}
