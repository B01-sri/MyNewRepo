package com.te.spring_rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.te.spring_rest.dto.EmployeeResponse;
import com.te.spring_rest.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@DeleteMapping(path = "/delete/{empId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@PathVariable(name="empId") String empId) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.deleteEmployee(empId)) {
			response.setMsg("Success");
			response.setStatuscode("200");
			response.setDesc("Account Deleted");
			
		}else {
			response.setMsg("Failure");
			response.setStatuscode("400");
			response.setDesc("Account Not Found");
		}
		
		return response;
		
	}
}
