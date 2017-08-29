package com.niit.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtil {
	private static Connection con;
	private static final String Driver = "oracle.jdbc.driver.OracleDriver";
	private static final String ConnectionString = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "hr";
	private static final String pwd = "hr";

	
	 public static Connection loadDriver() throws SQLException {
		try {
		     Class.forName(Driver);
		    } catch (ClassNotFoundException ex) {
		     System.out.println(ex);
		    }
		   con = DriverManager.getConnection(ConnectionString, user, pwd);
		   return con;
		     }
	 
	 
	 
	 }
