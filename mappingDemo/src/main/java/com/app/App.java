package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
        		.addAnnotatedClass(Instructor.class)
        		.addAnnotatedClass(InstructorDetails.class)
        		.buildSessionFactory();
        
        
        Session session = factory.openSession();
        session.beginTransaction();
        Instructor instructor = new Instructor("Ayush","Puranik","ayushpuranik@gmail.com");
        InstructorDetails instructorDetails = new InstructorDetails("Dancing","Auction");
        instructor.setInstructorDetails(instructorDetails);
        
        session.save(instructor);
        
//        int id = 1;
//        Instructor inst = session.get(Instructor.class, id);
//        inst.
        
        session.getTransaction().commit();
        session.close();
        factory.close();
           
    }
}
