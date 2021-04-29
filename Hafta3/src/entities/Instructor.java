package entities;

public class Instructor extends User {
private String title;
private String department;

	public Instructor() {
		super();
	}
	public Instructor(int id, String name, String surName, String email, String password, String nationalityNumber,
			String title, String department) {
		super(id, name, surName, email, password, nationalityNumber);
		this.title = title;
		this.department = department;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
}
