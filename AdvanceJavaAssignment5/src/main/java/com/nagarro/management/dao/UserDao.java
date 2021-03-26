package com.nagarro.management.dao;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nagarro.factory.provider.FactoryProvider;
import com.nagarro.management.model.Employee;
import com.nagarro.management.model.User;

public class UserDao {
	
	public void createUser(User user) {
		Session session =  FactoryProvider.getFactory().openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}
	
	public String authenticationUser(String userId, String pass) {
		
		Session session =  FactoryProvider.getFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from User where user_id=:user_Id");
		User u = (User) query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		
		String ans = "index";
		
		if (u==null)
		{
			ans = "index";
		}
		else if(u.getPass().equals(pass))
		{
			ans = "all-employee";
		}
		return ans;
	}
	
	public List<Employee> allEmployee(){
		
		Session session =  FactoryProvider.getFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from User");
		User u = (User) query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		
		List<Employee> employee = query.list();
		return employee;
	}

}
