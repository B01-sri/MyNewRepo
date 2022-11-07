package com.te.employeemanangementsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.employeemanangementsystem.entity.EmployeeEntity;
@Repository
public class EmployeeDaoImpl {
	public boolean register(EmployeeEntity employee) {
		boolean isRegistration = false;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(employee);
			transaction.commit();
			isRegistration = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isRegistration;
		
	}
}
