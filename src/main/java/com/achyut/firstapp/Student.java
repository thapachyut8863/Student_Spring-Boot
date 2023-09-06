package com.achyut.firstapp;

public class Student {
	
	private int id ;
	private String Firstname;
	private String Lastname;
	
	public Student(int id , String Firstname, String Lastname) {
		this.id = id;
		this.Firstname = Firstname;
		this.Lastname = Lastname;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	
	
	

}
