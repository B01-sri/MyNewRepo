package com.te.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.dto.EmployeeDto;
import com.te.springboot.dto.LoginDto;
import com.te.springboot.dto.ResponseDto;
import com.te.springboot.entity.Employee;
import com.te.springboot.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody EmployeeDto dto) {

		try {

			return new ResponseEntity<ResponseDto>(
					new ResponseDto(true, "Registered Successful", service.register(dto)), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ResponseDto>(
					new ResponseDto(false, "Registration UnSuccessful", null), HttpStatus.BAD_REQUEST);
		}

	}

	@PostMapping("/login")
	public ResponseEntity<?> getlogin(@RequestBody LoginDto dto) {
		if (service.getLogin(dto) != null) {
			return new ResponseEntity<ResponseDto>(new ResponseDto(true, "Login Successful", service.getLogin(dto)),
					HttpStatus.OK);
		}
		return new ResponseEntity<ResponseDto>(new ResponseDto(false, "Login UnSuccessful", null),
				HttpStatus.BAD_REQUEST);
	}

}
