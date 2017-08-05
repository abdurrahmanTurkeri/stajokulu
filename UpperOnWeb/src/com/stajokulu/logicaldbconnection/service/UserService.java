package com.stajokulu.logicaldbconnection.service;

import java.sql.PreparedStatement;
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
		String queryStr="select * from UserProfile";
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
			fetchedUser.setIdUser(rs.getInt("idUser"));
			userList.add(fetchedUser);
		}		
		return userList;
	}
	
	
	public boolean insertUser(User user) {
		String query="insert into UserProfile (idUser,first_name,last_name,age,password,emailAddress) values(?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement=DbHelper.getPreparedStatement(query);
			preparedStatement.setInt(1, 1233);
			preparedStatement.setString(2, user.getFirstName());
			preparedStatement.setString(3, user.getLastName());
			preparedStatement.setInt(4, user.getAge());
			preparedStatement.setString(5, user.getPassword());
			preparedStatement.setString(6, user.getEmailAddress());
			int result =preparedStatement.executeUpdate();
			if(result>0) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
