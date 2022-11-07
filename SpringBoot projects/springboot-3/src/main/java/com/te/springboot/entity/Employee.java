package com.te.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Employee_Details")
public class Employee {
	@Id
	private String empId;
	private String empName;
	private String empPwd;
	private String empEmailId;
}