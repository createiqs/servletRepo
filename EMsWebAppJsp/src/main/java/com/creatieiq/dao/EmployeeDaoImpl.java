package com.creatieiq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.createiq.util.ConnectionUtil;
import com.creatieiq.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> findAll() {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement("select * from employees");
			resultSet = ps.executeQuery();
			List<Employee> employees = new ArrayList<>();
			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setId(resultSet.getInt(1));
				employee.setFirstName(resultSet.getString(2));
				employee.setLastName(resultSet.getString(3));
				employee.setSalary(resultSet.getDouble(4));
				employee.setAge(resultSet.getInt(5));
				employee.setDoj(resultSet.getDate(6));
				employees.add(employee);
			}
			return employees;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		ConnectionUtil.closeConnection(resultSet, ps);
		return null;
	}

	@Override
	public void save(Employee employee) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement("");
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getFirstName());
//			ps.setDouble(3, employee.getEsal());
//			ps.setString(4, employee.getEmail());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionUtil.closeConnection(ps);

	}

	@Override
	public void update(Employee employee) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement("");
//			ps.setInt(4, employee.getEid());
//			ps.setString(1, employee.getEname());
//			ps.setDouble(2, employee.getEsal());
//			ps.setString(3, employee.getEmail());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionUtil.closeConnection(ps);

	}

	@Override
	public void delete(int id) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement("");
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
