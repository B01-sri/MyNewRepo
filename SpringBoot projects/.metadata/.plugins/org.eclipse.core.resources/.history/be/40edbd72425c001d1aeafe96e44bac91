package com.te.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.te.springboot.entity.EmployeePrimaryInfo;

public interface EmployeeDao extends CrudRepository<EmployeePrimaryInfo, String> {
	public EmployeePrimaryInfo findByEmpId(String empId);

//	@Query("from EmployeePrimaryInfo where empName like 'B%'")
	@Query("from EmployeePrimaryInfo")
	public List<EmployeePrimaryInfo> getAllEmployees();

	
	 
	
//	public List<EmployeePrimaryInfo> findAll();
	

}
