package com.te.empmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.empmanagementsystem.dao.EmployeeDao;
import com.te.empmanagementsystem.entity.Employee;
import com.te.empmanagementsystem.exception.EmployeeNotPresentException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public boolean register(Employee employee) {
		if (employee.getEmpId().startsWith("TYC")) {
			return dao.register(employee);

		}
		return false;
	}

	@Override
	public Employee authenticate(Employee employee) {
		if (employee.getEmpId().startsWith("TYC")) {
			return dao.authenticate(employee);

		}
		throw new EmployeeNotPresentException("Your employee Id should start with TYC!");
	}

	@Override
	public boolean deleteEmployee(String id) {
		return dao.deleteEmployee(id);

	}

	@Override
	public boolean update(Employee employee,Employee employee1) {
		
		return dao.update(employee,employee1);
	}

	@Override
	public List<Employee> allEmployees() {
		
		return dao.allEmployees();
	}


}
