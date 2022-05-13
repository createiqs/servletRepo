package com.createiq.login.controller;

public class Employee {
	
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		Employee e1=new Employee(1, "anil");
		Employee e2=new Employee(1, "anil");
	}

}
