package edu.mum.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import edu.mu.domain.User;
import edu.mum.service.UserService;

@Controller
//@SessionAttributes({ "logedUser", "user" })
public class AuthenticationController {
	
	@Autowired
	UserService userService;
	@RequestMapping(value="/authenticate", method=RequestMethod.POST)
	public String authnticate(@ModelAttribute("newUser") User newUser,  HttpSession session, Model model){
		String correctPassword = userService.getPasswordByName(newUser.getName());
		
		if(correctPassword!=null) {
			session.setAttribute("logedUser", newUser);
			//model.addAttribute("logedUser", newUser);
				return "redirect:loginSuccessful";
		}
		else
				return "login";
	}
	@RequestMapping("/loginSuccessful")
	public String successfulLogin() {
		return "LoginSuccessful";
	}
	@RequestMapping("/logout")
	public String logout(Model model, HttpSession session){
		session.invalidate();
		return "login";
	}
}
