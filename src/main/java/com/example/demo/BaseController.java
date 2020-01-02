package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class BaseController {
	
	
	@RequestMapping
	public String home()
	{
		System.out.println("시스템 시작");
		return "index";
		
	}
}
