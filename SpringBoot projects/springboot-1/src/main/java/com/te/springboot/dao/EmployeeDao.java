package com.te.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.springboot.entity.EmployeePrimaryInfo;

public interface EmployeeDao extends JpaRepository<EmployeePrimaryInfo, String> {

	
}
