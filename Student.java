package com.spring.autowiring.constructor;


public class Student {

	int sId;
	String sName;
	Course course;
	
	
	public Student(int sId, String sName, Course course) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", course=" + course + "]";
	}
	

	
}
