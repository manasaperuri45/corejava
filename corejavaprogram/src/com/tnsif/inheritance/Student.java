package com.tnsif.inheritance;

public class Student extends Citizen {
	private int rollno;
	private String collagename; 
	
	public Student() {
		System.out.print("welcome");
	}
	

	public Student( int rollno, String collagename) {
		
		this.rollno = rollno;
		this.collagename = collagename;
	}
	public Student(String name,long adharno,String address,long phoneno ) {
		super(name,adharno,address,phoneno);
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getCollagename() {
		return collagename;
	}


	public void setCollagename(String collagename) {
		this.collagename = collagename;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collagename=" + collagename + "]";
	}
}

	

