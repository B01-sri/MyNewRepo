package com.te.springboot.service;

import com.te.springboot.dto.EmployeeDto;
import com.te.springboot.dto.LoginDto;
import com.te.springboot.entity.Employee;

public interface EmployeeServiceImpl {
	public EmployeeDto register(EmployeeDto dto);

	

	public EmployeeDto getLogin(LoginDto dto);
}
