package com.vidvaan.ems.queries;

public interface EmployeeQueries {

	String INSERT_EMP = "INSERT INTO EMPLOYEES VALUES(?,?,?,?)";
	String FIND_ALL_EMPLOYEE="SELECT * FROM EMPLOYEES";
	String DELETE_BY_ID = "DELETE FROM EMPLOYEES WHERE EID=?";
	String UPDATE_EMP = "UPDATE EMPLOYEES SET ENAME=?, ESAL=?, EMAIL=? WHERE EID=?";
}
