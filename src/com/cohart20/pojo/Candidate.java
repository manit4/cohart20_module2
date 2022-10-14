package com.cohart20.pojo;

public class Candidate {
	
	private int rollNo;//Keep your variables private especially Global variables and we can not have any local variables with any access modifier
	private String name;
	
	public Candidate() {//Even though you do not use no-arg constructor to create an object or to instantiate the class, we are advised to 
						//have no-arg constructor always...
	}
	
	public Candidate(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
