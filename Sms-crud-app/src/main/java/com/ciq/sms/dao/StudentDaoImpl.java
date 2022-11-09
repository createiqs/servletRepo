package com.ciq.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ciq.sms.model.Student;
import com.ciq.sms.queries.StudentQueries;
import com.ciq.sms.util.ConnectionUtil;

public class StudentDaoImpl implements StudentDao {

	private static Connection connection = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;

	@Override
	public Student save(Student student) {
		try {
			connection = ConnectionUtil.openConnection();
			ps = connection.prepareStatement(StudentQueries.INSERT_SQL);
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setDouble(3, student.getFee());
			ps.setString(4, student.getEmail());
			int result = ps.executeUpdate();
			System.out.println(result + " inserted....");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.closeConnection(connection, ps);
		}
		return student;
	}

	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(int studentID) {
		// TODO Auto-generated method stub
		return 0;
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
				student.setFee(rs.getDouble(3));
				student.setEmail(rs.getString(4));
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.closeConnection(connection, ps, rs);
		}

		return students;
	}

}
