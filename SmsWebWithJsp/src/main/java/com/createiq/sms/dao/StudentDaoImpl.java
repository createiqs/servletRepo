package com.createiq.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.createiq.sms.model.Student;
import com.createiq.sms.queries.StudentQueries;
import com.createiq.sms.util.ConnectionUtil;

public class StudentDaoImpl implements StudentDAO {
	private static Logger LOGGER = Logger.getLogger(StudentDaoImpl.class);

	private static Connection connection = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;

	@Override
	public Student save(Student student) {
		try {
			connection = ConnectionUtil.openConnection();
			ps = connection.prepareStatement(StudentQueries.INSERT_SQL);
			ps.setString(1, student.getName());
			ps.setString(2, student.getEmail());
			ps.setString(3, student.getCourseName());
			int result = ps.executeUpdate();
			System.out.println(result + " inserted....");
			LOGGER.info("inserted a record on: " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.closeConnection(connection, ps);
		}
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<Student>();
		try {

			connection = ConnectionUtil.openConnection();
			ps = connection.prepareStatement(StudentQueries.SELECT_ALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setEmail(rs.getString(3));
				student.setCourseName(rs.getString(4));
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.closeConnection(connection, ps, rs);
		}

		return students;
	}

	@Override
	public Student update(Student student) {
		try {
			connection = ConnectionUtil.openConnection();
			ps = connection.prepareStatement(StudentQueries.UPDATE_SQL);
			ps.setString(1, student.getName());
			ps.setString(2, student.getEmail());
			ps.setString(3, student.getCourseName());
			ps.setInt(4, student.getId());
			int result = ps.executeUpdate();
			System.out.println(result + " updated....");
			LOGGER.info("updated a record on: " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.closeConnection(connection, ps);
		}
		return student;
	}

	@Override
	public int delete(Integer id) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConnectionUtil.openConnection();
			ps = connection.prepareStatement(StudentQueries.DELETE_BY_ID);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Student getById(int id) {
		try {
			Student student = new Student();
			connection = ConnectionUtil.openConnection();
			ps = connection.prepareStatement(StudentQueries.FIND_BY_ID_SQL);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setEmail(rs.getString(3));
				student.setCourseName(rs.getString(4));
			}
			return student;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.closeConnection(connection, ps);
		}
		return null;
	}

//	public static void main(String[] args) {
//		StudentDaoImpl impl = new StudentDaoImpl();
//		List<Student> allStudents = impl.getAllStudents();
//		for (Student student : allStudents) {
//			System.out.println(student);
//		}
//		System.out.println(impl.getById(2));
//	}

}
