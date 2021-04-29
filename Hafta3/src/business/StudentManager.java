package business;

import entities.Student;
import entities.User;
import logger.Logger;

public class StudentManager extends UserManager{

	private Logger _logger;
	public StudentManager(Logger logger) {
		super(logger);
		this._logger = logger;

	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		super.add(user);
		System.out.println("Öğrenci Eklendi");
	}
	
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		super.update(user);
		System.out.println("Öğrenci Güncellendi");

	}
	@Override
	public User Find(int id) {
		System.out.println("Öğrenci id:"+id+" Aranıyor");
		return super.Find(id);
		
	}
	@Override
	public void delete(User user) {
		super.delete(user);
	}
	
	@Override
	public void list(User... users) {
		super.list(users);
	}
	
	public void addStudentNumber(Student user,String studentNumber) {
		user.setStudentNumber(studentNumber);
		System.out.println("Öðrenci için Numarası: " + user.getStudentNumber() + " olarak eklendi.");
		_logger.Log();
	}
	
}
