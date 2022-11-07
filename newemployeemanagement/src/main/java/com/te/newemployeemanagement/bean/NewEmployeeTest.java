package com.te.newemployeemanagement.bean;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.newemployeemanagement.bean.NewEmployeeAddressinfo;
import com.te.newemployeemanagement.bean.NewEmployeePrimaryinfo;

public class NewEmployeeTest {

	public static void main(String[] args) {
		NewEmployeePrimaryinfo primaryinfo = new NewEmployeePrimaryinfo();
		primaryinfo.setEmpId(100);
		primaryinfo.setEmpName("Srimathi");
		primaryinfo.setEmpAge(25);
		primaryinfo.setEmpBloodgrp("B +ve");
		primaryinfo.setEmpEmailid("srimathir1197@gmail.com");
		primaryinfo.setEmpDOB("11.02.1997");
		primaryinfo.setEmpMartialStatus("Single");
		primaryinfo.setEmpGender("Female");
		primaryinfo.setEmpDesignation("Software Developer");
		primaryinfo.setEmpDeptno(10);

		NewEmployeeAddressinfo permanentaddressinfo = new NewEmployeeAddressinfo();

		permanentaddressinfo.setAddId(1);
		permanentaddressinfo.setAddressType("Permanent");
		permanentaddressinfo.setHouseNo("4/951 - C");
		permanentaddressinfo.setStreet("Teachers Colony");
		permanentaddressinfo.setCity("Dharmapuri");
		permanentaddressinfo.setState("Tamil Nadu");
		permanentaddressinfo.setCountry("India");
		permanentaddressinfo.setPincode(636701);
		permanentaddressinfo.setNewprimaryinfo(primaryinfo);
		

		NewEmployeeAddressinfo temporarytaddressinfo = new NewEmployeeAddressinfo();

		temporarytaddressinfo.setAddId(1);
		temporarytaddressinfo.setAddressType("Temporary");
		temporarytaddressinfo.setHouseNo("4/951 - C");
		temporarytaddressinfo.setStreet("Teachers Colony");
		temporarytaddressinfo.setCity("Dharmapuri");
		temporarytaddressinfo.setState("Tamil Nadu");
		temporarytaddressinfo.setCountry("India");
		temporarytaddressinfo.setPincode(636701);
		temporarytaddressinfo.setNewprimaryinfo(primaryinfo);

		ArrayList<NewEmployeeAddressinfo> arrayList = new ArrayList<>();
		arrayList.add(permanentaddressinfo);
		arrayList.add(temporarytaddressinfo);

		primaryinfo.setNewaddressinfos(arrayList);
		

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(primaryinfo);
			entityTransaction.commit();
		} catch (Exception e) {
			if (entityTransaction != null) {
				entityTransaction.rollback();
			}

		} finally {
			if (entityManager != null) {
				entityManager.close();
			}

		}

	}

}
