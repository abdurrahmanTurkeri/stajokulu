package com.stajokulu.logicaldbconnection.model;

public class User{

	private String firstName;
	private String lastName;
	private int age;
	private String emailAddress;
	private String password;
	private int idUser;
	
	
	public User() {
		super();
	}


	public User(String firstName, String lastName, String ageStr, String emailAddress, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = Integer.parseInt(ageStr);
		this.emailAddress = emailAddress;
		this.password = password;
	}
	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int ageGelen) {
		this.age = ageGelen;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public int getIdUser() {
		return idUser;
	}


	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	
	
	
	
}
