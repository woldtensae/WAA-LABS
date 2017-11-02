package edu.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import edu.mum.service.UserService;

@Controller
public class AuthenticationController {
	
	@Autowired
	UserService userService;
	@RequestMapping("/authenticate")
	public String authnticate(@RequestParam String name, @RequestParam String password){
		String correctPassword = userService.getPasswordByName(name);
		if(correctPassword!=null)
				return "LoginSuccessful";
		else
				return "login";
	}
}
