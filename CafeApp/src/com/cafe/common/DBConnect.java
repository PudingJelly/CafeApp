package com.cafe.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	//DB접근
	private DBConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static DBConnect conn = new DBConnect();
	
	public static DBConnect getInstance() {
		return conn;
	}
	
	public Connection getConnection() throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "hr";
		String upw = "hr";
		
		return DriverManager.getConnection(url,uid,upw);
				
	}
}
