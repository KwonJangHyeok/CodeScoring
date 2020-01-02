package com.example.demo.Board.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/Board")
public class BoardWeb {

	
	@RequestMapping(value = "/getConetent")
	void getContent(@RequestParam String idx)
	{
		System.out.println(idx);
		//return "Board
	}
	
	@RequestMapping(value = "/runCode")
	void runCode(@RequestParam String content)
	{
		System.out.println(content);
	}
}
