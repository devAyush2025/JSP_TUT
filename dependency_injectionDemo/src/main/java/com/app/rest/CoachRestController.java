package com.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Coach;
import com.app.entity.CricketCoach;



@RestController
@RequestMapping("/api")
public class CoachRestController {
	private Coach theCoach;
	private Coach anotherCoach;

//	@Autowired

	public CoachRestController(@Qualifier("cricketCoach") Coach theCoach,@Qualifier("cricketCoach") Coach anotherCoach) {
		super();
		this.theCoach = theCoach;
		this.anotherCoach = anotherCoach;
	}
@GetMapping("/check")
	public String check() {
		boolean check =  (theCoach == anotherCoach);
		return "theCoach == anotherCoach =" +check;

	}

	public Coach getTheCoach() {
		return theCoach;
	}

//	@Autowired
//	@Qualifier("cricketCoach")
	public void setTheCoach(Coach theCoach) {
		this.theCoach = theCoach;
	}

	@GetMapping("/workout")
	public String getWorkout() {
		return theCoach.getDailyWorkout();
	}

}
