package com.ciq.sms.service;

import java.util.List;

import com.ciq.sms.dao.StudentDaoImpl;
import com.ciq.sms.model.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDaoImpl dao = new StudentDaoImpl();

	@Override
	public Student save(Student student) {
		return dao.save(student);
	}

	@Override
	public Student update(Student student) {
		return dao.update(student);
	}

	@Override
	public int delete(int studentID) {
		return 0;
	}

	@Override
	public List<Student> getAllStudents() {
		return dao.getAllStudents();
	}

}
