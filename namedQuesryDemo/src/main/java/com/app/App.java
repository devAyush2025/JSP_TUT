package com.app;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.TypedQuery;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		Employee e = new Employee("Ayush", 800000, "Cricketer");
		
		session.save(e);
		
		session.getTransaction().commit();
		
		TypedQuery<Employee> query = session.getNamedQuery("findEmployeeByName");
		query.setParameter("name", "ayush");
		List<Employee> empList = query.getResultList();
		
		Iterator<Employee> itr = empList.iterator();
		
		while(itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp);
		}
		session.close();
		factory.close();
	}
}
