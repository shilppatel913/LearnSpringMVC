package springMVC.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMVC.Models.User;
import springMVC.dao.UserDao;

@Service  //will automatically know to create a bean for this service layer
public class UserService {
	@Autowired
	private UserDao userDao;
	public int serviceSaveUser(User user) {
		return this.userDao.saveUser(user);
	}
}
