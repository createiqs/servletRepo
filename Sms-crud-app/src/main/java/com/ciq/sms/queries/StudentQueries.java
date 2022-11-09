package com.ciq.sms.queries;

public interface StudentQueries {

	String SELECT_ALL = "select * from student";
	String INSERT_SQL = "insert into student (sid, name, fee, email) values(?,?,?,?)";
	String UPDATE_SQL = "update student set name=?, email=?, course=? where  sid=?";
	String DELETE_BY_ID = "Delete from student where sid=?";
	String FIND_BY_ID_SQL = "select * from student where sid=?";

}
