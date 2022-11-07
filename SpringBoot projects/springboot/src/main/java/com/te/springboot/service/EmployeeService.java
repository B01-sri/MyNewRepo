package com.te.springboot.service;

import org.springframework.stereotype.Service;

import com.te.springboot.entity.Employee;

public interface EmployeeService {
	public Employee getEmployee(String empId);

	public Employee register(Employee employee);
}
