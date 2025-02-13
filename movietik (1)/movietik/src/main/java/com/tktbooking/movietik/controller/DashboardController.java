package com.tktbooking.movietik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class DashboardController {
	 @GetMapping("/movietik/dashboard")
	    public String dashboard() {
	        return "Dashboard";
	    }

}
