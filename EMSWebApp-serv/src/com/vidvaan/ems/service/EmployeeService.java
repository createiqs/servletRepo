package com.vidvaan.ems.service;

import java.util.List;

import com.vidvaan.ems.model.Employee;

public interface EmployeeService {
	void save(Employee employee);

	void update(Employee employee);

	void delete(int id);

	List<Employee> getAll();

}
