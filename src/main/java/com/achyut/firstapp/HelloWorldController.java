package com.achyut.firstapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
//instead of using above two annotation use RestController
@RestController
public class HelloWorldController {
	//get HTTP Method
	@GetMapping("/hello-world")
	
	public static String getMethod() {
		return  "Hello World from-- Achyut Thapa";
	}
	

}
