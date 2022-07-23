package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection extends UserDBUtil {

	private static String url = "jdbc:mysql://localhost:3306/helpdesk";
	private static String username = "root";
	private static String password = "LAK123";
	private static Connection conn;

	// This works according to singleton pattern
	private DBConnection() {
		
	}
	

	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
			/*
			 * This create new connection objects when connection is closed or it is
			 * null
			 */
			if (conn == null || conn.isClosed()) {

				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn=DriverManager.getConnection(url,username,password);
					
				}catch(Exception e) {
				   System.out.println("Database connection is not Success!!!");
				}
			}
				return conn;
		}
	
}