package com.codeboard.coadeboardaws.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@RequestMapping("/getname")
	public String getName() {
		return "Deployment";
	}
}
