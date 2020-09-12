package com.control.chickenapp.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection conn = null;
	public static Connection getConnection() {
		try {
			if (conn == null || conn.isClosed()) {
				System.out.println("Inside create connection");
				conn = DriverManager.getConnection("jdbc:mysql://192.168.1.130:3306/chicken", "CHICKEN", "CHICKEN");
			} else {
				System.out.println();
			}
		}catch(Exception dbEx) {
			
		}
		return conn;
	}

}
