package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
		@RequestMapping("/showForm")
		public String showForm(Model theModel) {
			Student theStudent = new Student();
				theModel.addAttribute("student",theStudent);
			return "studentform";
		}
		@RequestMapping("/addStudent")
		public String addStudent(@ModelAttribute("student") Student theStudent) {
			System.out.println(theStudent);
		
			
			return "success";
		}
	
}
