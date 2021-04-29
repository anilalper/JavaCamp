package business;



import java.util.ArrayList;
import java.util.List;

import entities.User;
import logger.Logger;

public class UserManager {

	private Logger _logger;
	private List<User> _users;
	public UserManager(Logger _logger) {
		super();
		this._logger = _logger;
		this._users=new ArrayList<User>();
		
	}
	public void add(User user) {
		System.out.println("Adi: "+user.getName()+"Soyadi:"+user.getSurName()+"eklendi. Email:"+user.getEmail());
		_logger.Log();
		this._users.add(user);
	}
	
	public void update(User user) {
		
		User currentUser=Find(user.getId());
		
		if (currentUser==null) {
			System.out.println("Kullanıcı Bulunamadı");
			_logger.Log();
		}
		else {

			int userIndex=_users.indexOf(currentUser);
			currentUser.setEmail(user.getEmail());
			currentUser.setName(user.getName());
			currentUser.setNationalityNumber(user.getNationalityNumber());
			currentUser.setSurName(user.getSurName());
			currentUser.setPassword(user.getPassword());
			_users.set(userIndex, currentUser);
			System.out.println("Kullanıcı Güncellendi");
			_logger.Log();
		}
		
	}
	
	public void delete(User user) {
		User currentUser=Find(user.getId());
		int userIndex=_users.indexOf(currentUser);
		_users.remove(userIndex);
		System.out.println("Kullanıcı Listeden Çıkarıldı");
		_logger.Log();
	}
	
	public User Find(int id) {
		for (User user : _users) {
			if (user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	public void list(User... users) {
		for (User user : users) {
			System.out.println(user.getName() + " " + user.getSurName());
		}
		_logger.Log();
	}
	
	
	
}
