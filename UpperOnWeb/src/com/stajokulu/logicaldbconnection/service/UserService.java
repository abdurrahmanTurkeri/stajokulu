package com.stajokulu.logicaldbconnection.service;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	public  List<User> fetchAllUser() throws Exception {
		Statement statement=DbHelper.getDbStatement();
		String queryStr="select * from user";
		ResultSet rs= statement.executeQuery(queryStr);
		List<User> userList=new ArrayList<>();
		User fetchedUser=null;
		//Difference of using while vs if
		while(rs.next()) {
			//Fill all user detail 
			fetchedUser=new User();
			fetchedUser.setFirstName(rs.getString("first_name"));
			fetchedUser.setAge(rs.getInt("age"));
			fetchedUser.setLastName(rs.getString("last_name"));
			fetchedUser.setPassword(rs.getString("password"));
			fetchedUser.setEmailAddress(rs.getString("emailAddress"));
			userList.add(fetchedUser);
		}		
		return userList;
	}
	
}
