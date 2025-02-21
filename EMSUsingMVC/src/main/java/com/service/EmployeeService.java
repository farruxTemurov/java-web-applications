package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {

	EmployeeDao ed = new EmployeeDao();

	public String storeEmployee(Employee emp) {
		if (emp.getSalary() < 10000) {
			return "Salary must be > 10000";
		} else if (ed.storeEmployee(emp) > 0) {
			return "Record stored successfully";
		} else {
			return "Record wasn't stored";
		}
	}

	public List<Employee> findAllEmployee() {
		List<Employee> listOfEmp = ed.findAllEmployee();
		Iterator<Employee> li = listOfEmp.iterator();
		while (li.hasNext()) {
			Employee e = li.next();
			float bonus = e.getSalary() * 0.10f;
			e.setSalary(e.getSalary() + bonus);
		}
		return listOfEmp;
	}
}