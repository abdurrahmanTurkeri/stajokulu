package com.stajokulu.logicaldbconnection.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbHelper {

	public static Statement getDbStatement() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sys","root","123456");
		Statement stmt = conn.createStatement();
		return stmt;
	}
	
}
