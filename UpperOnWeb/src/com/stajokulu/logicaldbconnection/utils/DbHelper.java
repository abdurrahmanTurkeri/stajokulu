package com.stajokulu.logicaldbconnection.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;



public class DbHelper {

	public static Statement getDbStatement() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sys","root","");
		Statement stmt = conn.createStatement();
		return stmt;
	}
	
	public static PreparedStatement getPreparedStatement(String sql) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sys","root","");
		PreparedStatement stmt = conn.prepareStatement(sql);
		return stmt;
	}
	
}
