package com.tktbooking.movietik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movietik")
public class LoginController {
	 @GetMapping("/login")
	    public String login() {
	        return "Login";
	    }
	

}
