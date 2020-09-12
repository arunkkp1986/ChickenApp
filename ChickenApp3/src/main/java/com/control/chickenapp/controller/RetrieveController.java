package com.control.chickenapp.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.control.chickenapp.dbconn.DBConnection;

public class RetrieveController {
	public static boolean checkLogin(String mobileNo, String password) {
		Connection conn = null;
		boolean isAvailable = false;
		ResultSet result = null;
		if(mobileNo != null && !mobileNo.trim().equals("") 
				&& password != null && !password.trim().equals("")) {
			PreparedStatement stmt;
			try {
				conn = DBConnection.getConnection();
				String retrieveSQL = "SELECT * FROM USER WHERE MOBILE_NO=? AND PASSWORD=?";
				System.out.println(conn);
				if(conn != null) {
					stmt = conn.prepareStatement(retrieveSQL);
					stmt.setString(1, mobileNo);
					stmt.setString(2, password);
					result = stmt.executeQuery();
					if(result.next()) {
						isAvailable = true;
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return isAvailable;
	}
}
