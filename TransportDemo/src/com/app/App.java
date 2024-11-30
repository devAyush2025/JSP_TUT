package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	
	public static  void main(String []args)
	{
	  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	  Road r = context.getBean("road",Road.class);
	  r.callStart();
	}
}
