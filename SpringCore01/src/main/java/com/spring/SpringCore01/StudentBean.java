package com.spring.SpringCore01;

public class StudentBean {
	
	private int     studentId   	;
	private String  studentName 	;
	private String 	studentAddress	;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("Setting Student ID ");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting Student Name ");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting Student Address ");
		this.studentAddress = studentAddress;
	}
	public StudentBean(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentBean [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + "]";
	}
	
	
	
	

}
