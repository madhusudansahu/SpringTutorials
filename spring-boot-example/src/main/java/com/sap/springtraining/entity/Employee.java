package com.sap.springtraining.entity;

public class Employee {
	private String fname;
	private String lname;
	private String mname;
	private int age;
	public Employee(String fname, String lname, String mname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.mname = mname;
		this.age = age;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
