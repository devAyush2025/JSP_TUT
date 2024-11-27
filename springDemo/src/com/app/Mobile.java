package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		Sim sim =  context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
		
		
		
	}

}
