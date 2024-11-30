package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {
		@RequestMapping("/main")
		public String sayHello() {
			return "mainmenu";
		}
		@RequestMapping("/ayush")
		public String ayush() {
			return "ayush";
		}
}


