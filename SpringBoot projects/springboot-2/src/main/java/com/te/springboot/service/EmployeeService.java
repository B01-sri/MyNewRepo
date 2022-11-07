package com.te.springboot.service;

import java.util.List;

import com.te.springboot.dto.EmployeeDto;
import com.te.springboot.dto.LoginDto;
import com.te.springboot.entity.EmployeePrimaryInfo;

public interface EmployeeService {
	public EmployeeDto register(EmployeeDto dto);

	public EmployeeDto getById(LoginDto dto);

	public List<EmployeePrimaryInfo> getAllEmployees();

	public EmployeeDto getLogin(LoginDto dto);

	EmployeeDto updateDetails(EmployeeDto dto);

}