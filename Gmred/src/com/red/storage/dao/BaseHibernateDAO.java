package com.red.storage.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.red.storage.HibernateSessionFactory;




/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
	public boolean save(Object obj){
		try{
			Session session = HibernateSessionFactory.getSession();
			Transaction tran = session.beginTransaction();
			session.save(obj);
			tran.commit();
			return true;
		}catch(Exception e){
			Logger logger = LoggerFactory.getLogger(this.getClass());    
			logger.error(e.getMessage());
			e.printStackTrace();
			return false;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}
	
	public boolean update(Object obj){
		try{
			Session session = HibernateSessionFactory.getSession();
			Transaction tran = session.beginTransaction();
			session.update(obj);
			tran.commit();
			return true;
		}catch(Exception e){
			Logger logger = LoggerFactory.getLogger(this.getClass());    
			logger.error(e.getMessage());
			e.printStackTrace();
			return false;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}
	
	public boolean merge(Object obj){
		try{
			Session session = HibernateSessionFactory.getSession();
			Transaction tran = session.beginTransaction();
			session.merge(obj);
			tran.commit();
			return true;
		}catch(Exception e){
			Logger logger = LoggerFactory.getLogger(this.getClass());    
			logger.error(e.getMessage());
			e.printStackTrace();
			return false;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}
	
	public boolean delete(Object obj){
		try{
			Session session = HibernateSessionFactory.getSession();
			Transaction tran = session.beginTransaction();
			session.delete(obj);
			tran.commit();
			return true;
		}catch(Exception e){
			Logger logger = LoggerFactory.getLogger(this.getClass());    
			logger.error(e.getMessage());
			e.printStackTrace();
			return false;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}
	
	public boolean save(List list){
		try{
			Session session = HibernateSessionFactory.getSession();
			Transaction tran = session.beginTransaction();
			for(int i = 0; i < list.size(); i++){
				session.save(list.get(i));
			}
			tran.commit();
			return true;
		}catch(Exception e){
			Logger logger = LoggerFactory.getLogger(this.getClass());    
			logger.error(e.getMessage());
			e.printStackTrace();
			return false;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}
	
	
	public boolean update(List list){
		try{
			Session session = HibernateSessionFactory.getSession();
			Transaction tran = session.beginTransaction();
			for(int i = 0; i < list.size(); i++){
				session.update(list.get(i));
			}
			tran.commit();
			return true;
		}catch(Exception e){
			Logger logger = LoggerFactory.getLogger(this.getClass());    
			logger.error(e.getMessage());
			e.printStackTrace();
			return false;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}
	
	public List findAll(Class c){
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from " + c.getName());
		List list = query.list();
		HibernateSessionFactory.closeSession();
		return list;
	}
	
	public List findAll(Class c, String orderby, String sort){
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from " + c.getName() + " order by " + orderby + " " + sort);
		List list = query.list();
		HibernateSessionFactory.closeSession();
		return list;
	}
	
	public Object findByPK(Serializable o, Class c){
		Session session = HibernateSessionFactory.getSession();
		Object obj = session.get(c, o);
		HibernateSessionFactory.closeSession();
		return obj;
	}
	
	public boolean deleteExtendObject(String tablename, int recordid){
		try{
			Session session = HibernateSessionFactory.getSession();
			Transaction tran = session.beginTransaction();
			
			Query query = session.createQuery("delete from Extendint where tablename=? and recordid=?");
			query.setString(0, tablename);
			query.setInteger(1, recordid);
			query.executeUpdate();
			
			query = session.createQuery("delete from Extenddouble where tablename=? and recordid=?");
			query.setString(0, tablename);
			query.setInteger(1, recordid);
			query.executeUpdate();
			
			query = session.createQuery("delete from Extendvarchar where tablename=? and recordid=?");
			query.setString(0, tablename);
			query.setInteger(1, recordid);
			query.executeUpdate();
			
			query = session.createQuery("delete from Extendtext where tablename=? and recordid=?");
			query.setString(0, tablename);
			query.setInteger(1, recordid);
			query.executeUpdate();
			
			query = session.createQuery("delete from Extenddate where tablename=? and recordid=?");
			query.setString(0, tablename);
			query.setInteger(1, recordid);
			query.executeUpdate();
			tran.commit();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		finally{
			HibernateSessionFactory.closeSession();
		}
	}
	
}