package com.te.empmanagementsystem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.empmanagementsystem.entity.Employee;
import com.te.empmanagementsystem.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/register")
	public String getRegistrationForm() {
		return "registrationForm";
	}

	@GetMapping("/login")
	public String getLoginForm() {
		return "loginForm";
	}

	@PostMapping("/register")
	public String register(Employee employee, ModelMap map) {
		if (employee != null) {
			if (service.register(employee)) {
				map.addAttribute("msg", "Registration Successful!");
			} else {
				map.addAttribute("errMsg", "Something went wrong");
			}
		}
		return "registrationForm";
	}

	@PostMapping("/login")
	public String authenticate(Employee employee, ModelMap map, HttpServletRequest request) {
		if (employee != null && (!employee.getEmpId().isEmpty() || !employee.getPassword().isEmpty())) {
			Employee employee2 = service.authenticate(employee);
			if (employee2 != null) {
				HttpSession session = request.getSession();
				session.setAttribute("loggedIn", employee2);
				map.addAttribute("name", employee2.getEmpName());
				return "welcome";
			} else {
				map.addAttribute("errMsg", "Invalid credentials");
			}
		} else {
			map.addAttribute("errMsg", "Please enter something!");
		}
		return "loginForm";
	}

	@GetMapping("/delete")
	public String getDeleteForm(ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) Employee employee) {
		if (employee != null) {
			map.addAttribute("empId", employee.getEmpId());
			return "deleteForm";
		}
		map.addAttribute("errMsg", "Please login first");
		return "loginForm";
	}

	@PostMapping("/delete")
	public String deleteEmployee(ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) Employee employee) {
		if (employee != null) {
			service.deleteEmployee(employee.getEmpId());
			map.addAttribute("errMsg", "Account deleted!");
			return "registrationForm";
		}
		map.addAttribute("errMsg", "Please login first");
		return "loginForm";
	}

	@GetMapping("/logout")
	public String logout(ModelMap map, HttpSession session) {
		session.invalidate();
		map.addAttribute("errMsg", "Logged out successfully!");
		return "loginForm";
	}

	@GetMapping("/myDetails")
	public String myDetails(ModelMap map, @SessionAttribute(name = "loggedIn", required = false) Employee employee) {
		if (employee != null) {
			map.addAttribute("empId", employee.getEmpId());
			map.addAttribute("Ename", employee.getEmpName());
			map.addAttribute("E-email", employee.getEmailId());

		}
		return "seebyid";
	}

	@GetMapping("/allEmployees")
	public String allEmployees(ModelMap map) {

		List<Employee> all = service.allEmployees();
		map.addAttribute("Employee_Details", all);
		return "allDetails";
	}

	@GetMapping("/update")
	public String getUpdateForm(ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) Employee employee) {

		if (employee != null) {
			map.addAttribute("empId", employee.getEmpId());
			return "updateForm";
		}
		return "updateForm";

	}

	@PostMapping("/update")
	public String PostUpdateForm(ModelMap map, @SessionAttribute(name = "loggedIn", required = false) Employee employee,
			Employee employee1) {

		if (employee != null) {

			if (service.update(employee, employee1)) {

				map.addAttribute("errMsg", "Updated Successfully");
				return "loginForm";
			}

		}
		return "updateForm";

	}
}
