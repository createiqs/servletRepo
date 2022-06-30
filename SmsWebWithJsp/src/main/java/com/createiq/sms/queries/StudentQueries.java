package com.createiq.sms.queries;

public interface StudentQueries {

	String SELECT_ALL = "select * from student";
	String INSERT_SQL = "insert into student (name, email, course) values(?,?,?)";
	String UPDATE_SQL = "update student set name=?, email=?, course=? where  sid=?";
	String DELETE_BY_ID = "Delete from student where sid=?";
	String FIND_BY_ID_SQL = "select * from student where sid=?";

}
