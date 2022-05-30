package com.creatieiq.dao;

import java.util.List;

import com.creatieiq.model.Employee;


public interface EmployeeDao {

	void save(Employee employee);

	void update(Employee employee);

	List<Employee> findAll();

	void delete(int id);
}
