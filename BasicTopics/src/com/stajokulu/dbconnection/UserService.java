package com.stajokulu.dbconnection;

import java.sql.ResultSet;
import java.sql.Statement;

public class UserService {

	/**
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 * Why we need setter and getters
	 */
	public static User fetchUser(User user) throws Exception {
		Statement statement=DbHelper.getDbStatement();
		String queryStr="select * from user where emailAddress='"+user.getEmailAddress()+"' and password="+user.getPassword();
		ResultSet rs= statement.executeQuery(queryStr);
		String firstName=null;
		User fetchedUser=new User();
		//Difference of using while vs if
		while(rs.next()) {
			firstName=rs.getString("first_name");//Fill all user detail 
			fetchedUser.setFirstName(firstName);
			fetchedUser.setAge(rs.getInt("age"));
			fetchedUser.setLastName(rs.getString("last_name"));
			fetchedUser.setPassword(rs.getString("password"));
			fetchedUser.setEmailAddress(rs.getString("emailAddress"));
		}
		System.out.println("Sonuc :"+firstName);
		return fetchedUser;
	}
	
}
