package com.virtusa.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
	private Connection connection = null;
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arrivallist", "root", "root");

		} catch (Exception ex) {
			System.out.println("failed to create DB Connection!");
		}
		return connection;

	}
	
	public void closeConnection() {
		if(connection != null) {
			try {
				connection.close();
			} catch(Exception ex) {
				
			}
		}
	}

}
