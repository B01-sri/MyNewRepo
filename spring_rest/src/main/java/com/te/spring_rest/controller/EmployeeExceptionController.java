package com.te.spring_rest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.te.spring_rest.exception.EmployeeNotPresentException;


public class EmployeeExceptionController {

	@ExceptionHandler(EmployeeNotPresentException.class)
	public String excepHandler(HttpServletRequest request , EmployeeNotPresentException employeeNotPresentException) {
		request.setAttribute("errMsg", employeeNotPresentException.getMessage());
		return "loginForm";

}
}