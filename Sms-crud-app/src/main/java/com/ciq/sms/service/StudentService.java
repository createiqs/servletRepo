package com.ciq.sms.service;

import java.util.List;

import com.ciq.sms.model.Student;

public interface StudentService {

	Student save(Student student);

	Student update(Student student);

	int delete(int studentID);

	List<Student> getAllStudents();
}
