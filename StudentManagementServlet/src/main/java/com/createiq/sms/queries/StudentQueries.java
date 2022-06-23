package com.createiq.sms.queries;

public interface StudentQueries {

	String SELECT_ALL = "select * from student";
	String INSERT_SQL = "insert into student (name, email, course) values(?,?,?)";
	String UPDATE_SQL = "update student set name=?, email=?, course=? where  sid=?";

}
