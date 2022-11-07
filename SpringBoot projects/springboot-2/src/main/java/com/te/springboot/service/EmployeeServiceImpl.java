package com.te.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springboot.dao.EmployeeDao;
import com.te.springboot.dto.EmployeeDto;
import com.te.springboot.dto.LoginDto;
import com.te.springboot.entity.EmployeeEducationalInfo;
import com.te.springboot.entity.EmployeePrimaryInfo;
import com.te.springboot.entity.EmployeeSkills;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	@Autowired
	private ModelMapper modelmapper;

	@Override
	public EmployeeDto register(EmployeeDto dto) {
		EmployeePrimaryInfo map = modelmapper.map(dto, EmployeePrimaryInfo.class);
		map.getSecondaryinfo().setPrimaryinfo(map); // Setting the primaryinfo ,since it shows null
		for (EmployeeEducationalInfo i : map.getEducationalinfo()) {
			i.setPrimaryinfo(map);
		}
		List<EmployeePrimaryInfo> info = new ArrayList<>();
		info.add(map);
		List<EmployeeSkills> skill = new ArrayList<>();
		skill.addAll(map.getSkills());
		for (EmployeeSkills e : map.getSkills()) {
			e.setPrimaryinfo(info);
			for (EmployeePrimaryInfo emp : e.getPrimaryinfo()) {
				emp.setSkills(skill);
			}
		}
		EmployeePrimaryInfo save = dao.save(map);
		return modelmapper.map(save, EmployeeDto.class);
	}

	@Override
	public EmployeeDto getById(LoginDto dto) {

		EmployeePrimaryInfo map = modelmapper.map(dto, EmployeePrimaryInfo.class);
		EmployeePrimaryInfo findByEmpId = dao.findByEmpId(map.getEmpId());
		if (findByEmpId != null) {
			dto.setEmpName(findByEmpId.getEmpName()); // setting the name from db ,to b displayed when got by id
			return modelmapper.map(findByEmpId, EmployeeDto.class);

		}
		return null;

	}

	@Override
	public List<EmployeePrimaryInfo> getAllEmployees() {

//		List<EmployeePrimaryInfo> allEmployees = dao.getAllEmployees();
//		List<EmployeePrimaryInfo> list = new ArrayList<>();
//		for (Employee employee : allEmployees) {
//			
//			primary.getEmpId(),
//			primary.getEmpName(),
//			primary.getEmpDeptNo(),
//			primary.getEmpDesignation(),
//			primary.getSecondaryinfo().getEmpManager()) ;
//		}
//		
		return null;

	}

	

	

	@Override
	public EmployeeDto getLogin(LoginDto dto) {
		EmployeePrimaryInfo map = modelmapper.map(dto, EmployeePrimaryInfo.class);
		EmployeePrimaryInfo findByEmpId = dao.findByEmpId(map.getEmpId());
		if (findByEmpId != null) {
			if (findByEmpId.getEmpName().equalsIgnoreCase(map.getEmpName())) {

				return modelmapper.map(findByEmpId, EmployeeDto.class);

			}
		}
		return null;
	}

	@Override
	public EmployeeDto updateDetails(EmployeeDto dto) {
		EmployeePrimaryInfo map = modelmapper.map(dto, EmployeePrimaryInfo.class);
		EmployeePrimaryInfo updated = dao.save(map);
		return modelmapper.map(updated, EmployeeDto.class);
	}

}