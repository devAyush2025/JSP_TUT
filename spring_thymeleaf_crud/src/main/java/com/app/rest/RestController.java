package com.app.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController {
	
	@GetMapping("/hello")
	public String greet(Model theModel) {
		theModel.addAttribute("theData",new java.util.Date());
		return "Hello Ashishs Baby";
	}
}
