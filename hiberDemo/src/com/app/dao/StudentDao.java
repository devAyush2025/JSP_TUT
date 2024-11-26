package com.app.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.entity.Student;

public class StudentDao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		 Session session = factory.openSession();
		 
		 session.beginTransaction();
		 
		 
		 
//		 Student s = new Student();
		 
//		 s.setFirstName("Ayush");
//		 s.setLastName("Puranik");
//		 s.setAge(22);
//		 int id =3;
//		 Student stud1 = session.get(Student.class);
		 Student stud1 = new Student();
		 int i = 0;
		 
//		 Creating rows
		 /*for(int j = 0; j< 5;j++) {
			 System.out.println("Enter f name : ");
			 String fnm = sc.next();
			 stud1.setFirstName(fnm);
			 
			 System.out.println("Enter l name : ");
			 String lnm = sc.next();
			 stud1.setLastName(lnm);
			 System.out.println("Enter age : ");
			 int a = sc.nextInt();
			 stud1.setAge(a);
		 }*/
		 
//		 int id = 2;
//		 Student editStud= session.get(Student.class, id);
		 
		 
//		 updateing rows
		 /*editStud.setFirstName("Alia");
		 editStud.setLastName("malhotra");
		 editStud.setAge(22);
		 */
		 
		 /*
		 Student deleStud = session.get(Student.class, id);
		 session.delete(deleStud);
		 */
		 
		 
		 System.out.println("List of Students");
		 
		 Query query = session.createQuery("from Student");
		 
		 List< Student> list = query.getResultList();
		 
		 for (Student s : list) {
			System.out.println(s);
		}
		 
		 
//			  i = (int)session.save(editStud);
		 session.getTransaction().commit();
		 
				 
		 System.out.println("object created = "+i);
		 
		 session.close();
		 factory.close();
	}

}
