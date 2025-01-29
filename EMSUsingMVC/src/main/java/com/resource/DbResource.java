package com.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbResource {

	private static Connection con;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Farrux2006");
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public static Connection getDbConnection() {
		try {
			return con;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}
}