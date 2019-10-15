package com.vastika.studentinfosystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Here we are going to write database code
public class DBUtil {
	private static final String URL = "jdbc:mysql://localhost:3306/student_db";
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		// 1.Register the Driver
		Class.forName(DRIVER_NAME);
		
		
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
	

}
