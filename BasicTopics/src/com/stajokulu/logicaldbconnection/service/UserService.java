package com.stajokulu.logicaldbconnection.service;

import java.sql.ResultSet;
import java.sql.Statement;

import com.stajokulu.logicaldbconnection.model.User;
import com.stajokulu.logicaldbconnection.utils.DbHelper;

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
		ResultSet rs= statement.executeQuery("select * from user where email_address="+user.getEmailAddress()+" and password="+user.getPassword());
		String firstName=null;
		User fetchedUser=new User();
		//Difference of using while vs if
		while(rs.next()) {
			firstName=rs.getString("first_name");//Fill all user detail 
			fetchedUser.setFirstName(firstName);
		}
		System.out.println("Sonuc :"+firstName);
		return fetchedUser;
	}
	
}
