package com.suresh.rentservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubController {
	
	@RequestMapping("/rentmaster/greeting")
	public String sayHello(){
		return "<h1> local change in october test 1";
	}

}