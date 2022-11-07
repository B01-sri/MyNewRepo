package com.te.spring_rest.dao;


	import java.util.List;

	import com.te.spring_rest.entity.Employee;

	public interface EmployeeDao {
		
		public boolean register(Employee employee);
		public boolean update(Employee employee,Employee employee1);
		public Employee authenticate(Employee employee);
		public List<Employee> allEmployees();
		public boolean deleteEmployee(String empId);

	}


