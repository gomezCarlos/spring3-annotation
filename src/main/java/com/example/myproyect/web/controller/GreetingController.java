package com.example.myproyect.web.controller;

import com.example.myproyect.web.model.Greeting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

	@RequestMapping(value="/greeting/{user}", method = RequestMethod.GET)
	public @ResponseBody Greeting greetUser(@PathVariable String user) {

		Greeting greet = new Greeting();

		greet.setDestination(user);
		greet.setMessage("This is a JSON greeting");

		return greet;
	}
	
}
