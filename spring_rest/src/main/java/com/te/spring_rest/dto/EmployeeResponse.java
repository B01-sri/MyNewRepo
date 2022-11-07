package com.te.spring_rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)

public class EmployeeResponse {
	private String statuscode;
	private String msg;
	private String desc;
	private Object object;
}
