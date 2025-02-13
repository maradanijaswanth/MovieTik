package com.tktbooking.movietik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieTheatreController {
	 @GetMapping("/movietik/theatre")
	    public String theatre() {
	        return "Theatres";
	    }

}
