package com.te.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.dto.EmployeeDto;
import com.te.springboot.dto.LoginDto;
import com.te.springboot.dto.ResponseDto;
import com.te.springboot.entity.EmployeePrimaryInfo;
import com.te.springboot.service.EmployeeServiceImpl;

@RestController

public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl service;

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody EmployeeDto dto) {
		try {
			return new ResponseEntity<ResponseDto>(
					new ResponseDto(false, "Registered Successful", service.register(dto)), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ResponseDto>(new ResponseDto(true, "Something Went Wrong !", null),
					HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/login")
	public ResponseEntity<?> getlogin(@RequestBody LoginDto dto) {
		if (service.getLogin(dto) != null) {
			return new ResponseEntity<ResponseDto>(new ResponseDto(false, "Login Successful ", dto), HttpStatus.OK);
		}
		return new ResponseEntity<ResponseDto>(new ResponseDto(true, "Login UnSuccessful !", null),
				HttpStatus.BAD_REQUEST);

	}

	@PostMapping("/getbyid")
	public ResponseEntity<?> getById(@RequestBody LoginDto dto) {
		if (service.getById(dto) != null) {
			return new ResponseEntity<ResponseDto>(new ResponseDto(false, "ID Found ", dto), HttpStatus.OK);
		}
		return new ResponseEntity<ResponseDto>(new ResponseDto(true, "ID not found !", null), HttpStatus.BAD_REQUEST);

	}

	@PutMapping("/update")
	public ResponseEntity<?> updateDetails(@RequestBody EmployeeDto dto) {
		try {
			return new ResponseEntity<ResponseDto>(
					new ResponseDto(false, "Update Successful", service.updateDetails(dto)), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<ResponseDto>(new ResponseDto(true, "Update Not Successful !", null),
					HttpStatus.BAD_REQUEST);
		}

	}
//	try {
//		return new ResponseEntity<EmployeePrimaryInfo>(service.updateDetails(primaryinfo), HttpStatus.OK);
//	} catch (Exception e) {
//		return new ResponseEntity<String>("Data is Not Updated", HttpStatus.BAD_REQUEST);
//	}

	@GetMapping("/getall")
	public ResponseEntity<?> getAllEmployees() {

		if (service.getAllEmployees() != null) {
			return new ResponseEntity<>(service.getAllEmployees(), HttpStatus.OK);
		}
		return new ResponseEntity<String>("Something went Wrong ", HttpStatus.BAD_REQUEST);
	}

}
