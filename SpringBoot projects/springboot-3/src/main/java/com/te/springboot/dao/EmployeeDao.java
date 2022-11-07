package com.te.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.springboot.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, String> {
	public Employee findByEmpId(String empId);

}
