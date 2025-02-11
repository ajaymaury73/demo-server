package com.deploy.war.demoApp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/user")
	public List<String> getUsers() {
    	List<String> ls=List.of("Ajay","Anil,Suresh");
		
		return ls;
		
	}
}
