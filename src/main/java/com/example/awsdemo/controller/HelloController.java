package com.example.awsdemo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/awsDemo/{name}")
	public String index(@PathVariable("name") String name) {
		return "Greetings from AWS1! "+name;
		//String html = "<HTML><head>blah blah</head><>/HTML";
		//return html;
	}

}