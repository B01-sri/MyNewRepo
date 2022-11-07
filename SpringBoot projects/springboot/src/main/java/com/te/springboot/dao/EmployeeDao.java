package com.te.springboot.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.springboot.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, String> {

	public Employee findByEmpId(String empId); //to find one employee by id

	@Query("from Employee where empName like 's%'")
	public Employee getAllEmployees(); //to get all the Employees
}
