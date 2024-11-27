package com.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.persistence.TypedQuery;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class).buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();
		/*
		 * Instructor instructor = new Instructor("Ayush", "Puranik",
		 * "ayushpuranik@gmail.com"); InstructorDetails instructorDetails = new
		 * InstructorDetails("Dancing", "Auction");
		 * instructor.setInstructorDetails(instructorDetails);
		 */
//        session.save(i);

		/*
		 * int id = 3; Instructor i = session.get(Instructor.class, id);
		 * session.delete(i);
		 */
//		
//		int id = 4;
//		Instructor i = session.get(Instructor.class, id);
//		
//	i.setFirstName("Ashish");
//	i.setLastName("Dubbewar");
//	 session.save(i);
		
		
		
		
		/*print list
		
		TypedQuery<Instructor> query = session.getNamedQuery("find_Ayush");
		
		List<Instructor> list = query.getResultList();

		for (Instructor i : list) {
			System.out.println(i);
		}
		
*/
		
		int id = 4;
		InstructorDetails i  = session.get(InstructorDetails.class, id);
		session.delete(i);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
