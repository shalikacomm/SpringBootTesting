package com.suresh.rentservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingController {
	
	@RequestMapping("/rentmaster/greeting")
	public String sayHello(){
		return "<h1> this is cloud changes </h1>";
	}

}
