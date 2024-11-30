package com.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
@Autowired
	Heart heartObject;

//	@Autowired
	public Human() {
		System.out.println("Human Created");
	}

//@Autowired
	public void setHeart(Heart heartObject) {
		System.out.println("In setter of heart");
		this.heartObject = heartObject;
	}

//	@Autowired
	public Human(Heart heartObject) {
		System.out.println("Parameterized constuctor called");
		this.heartObject = heartObject;
	}

}
