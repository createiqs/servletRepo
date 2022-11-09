package com.ciq.sms.dao;

import java.util.List;

import com.ciq.sms.model.Student;

public interface StudentDao {
	
	Student save(Student student);
	Student update(Student student);
	int delete(int studentID);
	List<Student> getAllStudents();
	
	

}
