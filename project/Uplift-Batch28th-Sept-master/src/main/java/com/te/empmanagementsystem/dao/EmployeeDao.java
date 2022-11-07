package com.te.empmanagementsystem.dao;

import java.util.List;

import com.te.empmanagementsystem.entity.Employee;

public interface EmployeeDao {
	
	public boolean register(Employee employee);
	public boolean update(Employee employee,Employee employee1);
	public Employee authenticate(Employee employee);
	public List<Employee> allEmployees();
	public boolean deleteEmployee(String id);

}
