package com.stajokulu.dbconnection;

public class TestLogin {
	
	public static void main(String[] args) throws Exception {
		User user=new User();
		user.setEmailAddress("abdurrahman.turkeri@gmail.com");
		user.setPassword("123456");
		UserService.fetchUser(user);
	}

}
