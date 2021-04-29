package business;

import entities.Instructor;
import entities.User;
import logger.Logger;

public class InstructorManager extends UserManager{

	private Logger _logger;
	public InstructorManager(Logger logger) {
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
	
	public void addTitle(Instructor user,String Title) {
		user.setTitle(Title);;
		System.out.println("Öğretmen için Ünvan: " + user.getTitle() + " olarak eklendi.");
		_logger.Log();
	}
	
	public void addDepartment(Instructor user,String Department) {
		user.setDepartment(Department);;
		System.out.println("Öğretmen için Bölüm: " + user.getDepartment() + " olarak eklendi.");
		_logger.Log();
	}
}