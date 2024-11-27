package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class).addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();

		Instructor i1 = new Instructor("Shyam", "shyam@gmail.com");
//		Instructor i2 = new Instructor("sumesh", "sumedh@gmail.com");

//		session.save(i1);
//		session.save(i2);

		Course c1 = new Course("Physics");
	
		Course c2 = new Course("Chemistry");
		session.save(c1);
		session.save(c2);
		i1.addCourse(c1);
		
		session.getTransaction().commit();

		session.close();
		factory.close();
	}

}
