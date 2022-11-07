package com.te.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.entity.EmployeePrimaryInfo;
import com.te.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody EmployeePrimaryInfo primaryinfo) {

		try {
			return new ResponseEntity<EmployeePrimaryInfo>(service.register(primaryinfo), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Something Went Wrong !", HttpStatus.BAD_REQUEST);

		}

	}
}
