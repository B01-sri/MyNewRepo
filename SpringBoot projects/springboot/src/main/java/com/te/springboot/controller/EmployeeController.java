package com.te.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.entity.Employee;
import com.te.springboot.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/getById/{empId}")
	public ResponseEntity<?> getById(@PathVariable String empId) {
		if (service.getEmployee(empId) != null) {
			return new ResponseEntity<Employee>(service.getEmployee(empId), HttpStatus.OK);

		}
		return new ResponseEntity<String>("Id not found", HttpStatus.BAD_REQUEST);

	}

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody Employee employee) {
		if (service.register(employee) != null) {
			return new ResponseEntity<Employee>(service.register(employee), HttpStatus.OK);

		}

		return new ResponseEntity<String>("Something went wrong", HttpStatus.BAD_REQUEST);

	}


		
		
	}
	

