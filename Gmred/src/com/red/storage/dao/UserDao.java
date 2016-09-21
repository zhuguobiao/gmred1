package com.red.storage.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.red.storage.HibernateSessionFactory;
import com.red.storage.entity.User;

public class UserDao extends BaseHibernateDAO{
	public List<User> findUserBynameAndPass(String name, String password) {
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createSQLQuery("select * from User where name=:name and password=:password").addEntity(User.class);
		query.setString("name", name);
		query.setString("password", password);
		List<User> list = query.list();
		HibernateSessionFactory.closeSession();
		return list;
	}
	
}
