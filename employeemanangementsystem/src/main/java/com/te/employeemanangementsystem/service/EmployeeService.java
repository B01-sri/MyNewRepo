package com.te.employeemanangementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.te.employeemanangementsystem.dao.EmployeeDaoImpl;
import com.te.employeemanangementsystem.entity.EmployeeEntity;

@Service
public class EmployeeService implements EmployeeServiceImpl {
	@Autowired
	public EmployeeDaoImpl employeedao;

	@Override
	public boolean register(EmployeeEntity employee) {
		if (employee.getEmpId().startsWith("TYC")) {
return employeedao.register(employee);
		}
		return false;
	}

}
