package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		Sim sim1 =  context.getBean("sim1",Sim.class);
		sim1.calling();
		sim1.data();
		Sim sim2 =  context.getBean("sim2",Sim.class);
		sim2.calling();
		sim2.data();
		
		
		
	}

}
