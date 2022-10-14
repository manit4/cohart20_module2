package com.cohart20.pojo;

public class User {
	
	private String firstName;
	private String lastname;
	public User() {
		
	}
	public User(String firstName, String lastname) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	

}
