package com.createiq.sms.model;

public class Student {

	private int id;
	private String name;
	private String email;
	private String courseName;

	public Student() {
	}

	public Student(int id, String name, String email, String courseName) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.courseName = courseName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student(String name, String email, String courseName) {
		this.name = name;
		this.email = email;
		this.courseName = courseName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", courseName=" + courseName + "]";
	}

}
