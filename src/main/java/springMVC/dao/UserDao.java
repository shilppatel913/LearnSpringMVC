package springMVC.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springMVC.Models.User;

//this is where you will write methods like insert save update and delete using hibernateTemplate

@Repository   //this is will tell to create a bean automatically for useDao
public class UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int saveUser(User user) {
		Integer id=(Integer)this.hibernateTemplate.save(user);
		return id;
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
