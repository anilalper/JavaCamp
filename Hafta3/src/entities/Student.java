package entities;

public class Student extends User {
	
	private String studentNumber;
	public Student() {
		super();
	}	
	public Student(int id, String name, String surName, String email,
			String password, String nationalityNumber,String studentNumber) {
			super(id, name, surName, email, password, nationalityNumber);
			this.studentNumber=studentNumber;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}



}
