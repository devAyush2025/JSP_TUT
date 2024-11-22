package com.app.utility;

import java.util.*;

import com.app.model.Student;

public class StudentUtility {
	public static List<Student> getStudList() {
		List<Student> list = new ArrayList<Student>();
 
		list.add(new Student("Ayush","Puranik","ayush@gmail.com"));
		list.add(new Student("Aarav", "Sharma", "aarav.sharma@gmail.com"));
		list.add(new Student("Ishita", "Rao", "ishita.rao@gmail.com"));
		list.add(new Student("Vihaan", "Patel", "vihaan.patel@gmail.com"));
		list.add(new Student("Riya", "Singh", "riya.singh@gmail.com"));
		list.add(new Student("Arjun", "Mehta", "arjun.mehta@gmail.com"));
		list.add(new Student("Sneha", "Kapoor", "sneha.kapoor@gmail.com"));
 
 
		return list;
}
}