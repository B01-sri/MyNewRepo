




package com.te.empmanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.empmanagementsystem.entity.Employee;
import com.te.empmanagementsystem.exception.EmployeeNotPresentException;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean register(Employee employee) {
		boolean isRegistered = false;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
			isRegistered = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isRegistered;
	}

	@Override
	public Employee authenticate(Employee employee) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		Employee employee2 = manager.find(Employee.class, employee.getEmpId());
		if (employee2 != null) {
			if (employee.getPassword().equals(employee2.getPassword())) {
				return employee2;
			} else {
				throw new EmployeeNotPresentException("Incorrect password");
			}
		} else {
			throw new EmployeeNotPresentException("Incorrect ID");
		}
	}

	@Override
	public boolean deleteEmployee(String id) {
		boolean isDeleted = false;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Employee employee = manager.find(Employee.class, id);
			manager.remove(employee);
			transaction.commit();
			isDeleted = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

	@Override
	public boolean update(Employee employee, Employee employee1) {
		boolean isUpdated = false;
		EntityTransaction transaction;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			Employee employee2 = manager.find(Employee.class, employee.getEmpId());
			if (employee2 != null) {
				if (!employee.getEmpName().isEmpty()) {
					employee2.setEmpName(employee1.getEmpName());
				} else if (!employee.getEmailId().isEmpty()) {
					employee2.setEmailId(employee1.getEmailId());
				} else if (!employee.getPassword().isEmpty()) {
					employee2.setPassword(employee1.getPassword());
				}
			}
			transaction.commit();
			isUpdated = true;
			return isUpdated;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return isUpdated;
	}

	@Override
	public List<Employee> allEmployees() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		String String = "from Employee";
		Query query = manager.createQuery(String);
		List<Employee> resultList = query.getResultList();
		return resultList;

	}

}
