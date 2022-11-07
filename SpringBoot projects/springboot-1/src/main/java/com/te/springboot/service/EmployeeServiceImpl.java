package com.te.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springboot.dao.EmployeeDao;
import com.te.springboot.entity.EmployeePrimaryInfo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;

	@Override
	public EmployeePrimaryInfo register(EmployeePrimaryInfo primaryinfo) {

		return dao.save(primaryinfo);
	}

}
