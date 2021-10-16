package com.css.repository.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.css.repository.constant.DBInfo;
import com.css.util.MessageBundle;

public class JdbcUtil {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("while loading the Driver we get" + e.getMessage());
		}
	}

	public static Connection getConnection() throws SQLException {
		// Step 2: Establish the connection.
		final String url = "jdbc:mysql://localhost:3306/user_detail?useSSL=false";
		return DriverManager.getConnection(url, "root", "Sneha@123");
	}
}
