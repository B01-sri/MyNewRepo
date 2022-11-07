package com.te.employeemanangementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.employeemanangementsystem.entity.EmployeeEntity;
import com.te.employeemanangementsystem.service.EmployeeService;

@Controller
public class Employeecontroller {
@Autowired
	public EmployeeService employeeservice;
	@GetMapping("/register")
	public String getRegistrationForm() {
		return "homepage";
		}
	
	@GetMapping("/login")
	public String getLoginForm() {
		return "login";
		}
	
	
	@PostMapping("/register")
	public String getRegistration(EmployeeEntity employee,ModelMap map) {
		if(employee != null) {
			if(employeeservice.register(employee)) {
				map.addAttribute("msg", "Registered Successfully");
				}else {
					map.addAttribute("errMsg", "Something went is wrong");
				}
			
		}
		return null;
		
	}
}
