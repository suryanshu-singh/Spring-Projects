package com.ibm.bootinit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //contains a set of url's that can be accessed from the browser....or making this class act as a RestController
@RequestMapping("app")
public class TestController {
	
	
	@RequestMapping("greeting") //acts as the url to hit for this method
	String getGreetings() {
		return "Hello this is the moment we are using spring";
	}
}
