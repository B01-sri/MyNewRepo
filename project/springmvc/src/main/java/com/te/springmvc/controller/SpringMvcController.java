package com.te.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.springmvc.pojo.Employee;

@Controller
public class SpringMvcController {

	@RequestMapping("/login")
	public String getLoginForm() {
		return "homePage";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String firstWayofGettingFormData(HttpServletRequest request, ModelMap map) {
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");

		map.addAttribute("name", user);
		map.addAttribute("pass", pwd);

		return "welcome";
	}

	@PostMapping("/login1")
	public String secondWayofGettingFormData(ModelMap map, @RequestParam String user, @RequestParam String pwd) {

		map.addAttribute("name", user);
		map.addAttribute("pass", pwd);

		return "welcome";
	}

	@PostMapping("/login2")
	public String thirdWayofGettingFormData(ModelMap map, String user, String pwd) {

		map.addAttribute("name", user);
		map.addAttribute("pass", pwd);

		return "welcome";
	}

	@PostMapping("/login3")
	public String fourthWayofGettingFormData(ModelMap map, Employee employee) {

		map.addAttribute("name", employee);
		return "welcome";
	}
}
