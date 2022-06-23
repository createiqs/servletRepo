package com.createiq.sms.service;

import java.util.List;

import com.createiq.sms.dao.StudentDaoImpl;
import com.createiq.sms.model.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDaoImpl dao = new StudentDaoImpl();

	@Override
	public Student save(Student student) {
		return dao.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return dao.getAllStudents();
	}

	public Student update(Student student) {
		return dao.update(student);

	}

	@Override
	public int delete(Integer id) {
		return dao.delete(id);
	}

}
