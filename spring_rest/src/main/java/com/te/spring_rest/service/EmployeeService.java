package com.te.spring_rest.service;

import java.util.List;

import com.te.spring_rest.entity.Employee;

public interface EmployeeService {

	public boolean register(Employee employee);

	public boolean update(Employee employee, Employee employee1);

	public List<Employee> allEmployees();

	public Employee authenticate(Employee employee);

	public boolean deleteEmployee(String empId);
}
