package com.te.springboot.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springboot.dao.EmployeeDao;
import com.te.springboot.dto.EmployeeDto;
import com.te.springboot.dto.LoginDto;
import com.te.springboot.entity.Employee;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService implements EmployeeServiceImpl {

	@Autowired
	private EmployeeDao dao;
	@Autowired
	private ModelMapper modelmapper;

	@Override
	public EmployeeDto getLogin(LoginDto dto) {

		Employee map = modelmapper.map(dto, Employee.class);

		Employee empId = dao.findByEmpId(map.getEmpId());
		if(empId != null) {
		if (map.getEmpPwd().equals(empId.getEmpPwd())) {
			return modelmapper.map(empId, EmployeeDto.class);

		}
		}
		return null;

	}

	@Override
	public EmployeeDto register(EmployeeDto dto) {
		Employee map = modelmapper.map(dto, Employee.class);
		Employee save = dao.save(map);

		return modelmapper.map(save, EmployeeDto.class);
	}

}