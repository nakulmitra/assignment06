package com.nagarro.factory.provider;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author nakulmitra
 *
 */
public class FactoryProvider {
	//factory variable
	public static SessionFactory factory;
	
	/**
	 * return the factory reference
	 * @return
	 */
	public static SessionFactory getFactory() {
		
		if(factory==null) {
			factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		
		return factory;
	}
	
	/**
	 * close factory object
	 */
	public void closeFactory() {
		if(factory.isOpen()) {
			factory.close();
		}
	}

}