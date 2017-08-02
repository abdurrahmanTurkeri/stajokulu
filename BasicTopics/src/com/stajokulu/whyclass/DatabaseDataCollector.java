package com.stajokulu.whyclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseDataCollector {

	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 *             Why we need exception and exception types
	 */
	public static String getUserName(int id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sys", "root", "123456");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from user where iduser=" + id);
		String firstName = null;
		int age=0;
		while (rs.next()) {
			firstName = rs.getString("first_name");
			age=rs.getInt("age");
		}
		System.out.println("Sonuc :" + firstName+age);
		return firstName;
	}
	
	public static void main(String[] args) throws Exception {
		String userName=getUserName(1);
		
	}
}
