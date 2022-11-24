package com.demo.name;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Namecontroller 
{
	@RequestMapping("/")
	public String hello() {
		return "Hello my name is Riri";
	}

}
