package com.pxu.k18.MyLoginForm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pxu.k18.MyLoginForm.model.User;

@Controller
public class LoginController {
	@ModelAttribute("user")
    public User setUser() {
		return new User();
	}
	
	@GetMapping("/showLoginForm")
    public String showForm() {
        return "login-form";
    }
	
	@PostMapping("/saveLoginForm")
    public ModelAndView saveUser(@ModelAttribute("user") User user) {
		if (user.getUsername().equals("admin") && user.getPassword().equals("1234")) {
			ModelAndView modelAndView = new ModelAndView("login-success");
	        modelAndView.addObject("message", "User SignUp successfully.");
	        modelAndView.addObject("user", user);
	        return modelAndView;
		} else {
			ModelAndView modelAndView = new ModelAndView("login-form");
	        modelAndView.addObject("message", "User SignUp failed.");
	        modelAndView.addObject("user", user);
	        return modelAndView;
		}
    }
}
