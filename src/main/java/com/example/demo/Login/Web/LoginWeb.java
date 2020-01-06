package com.example.demo.Login.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Login.Entity.LoginEntity;
import com.example.demo.Login.Service.LoginService;

@Controller
@RequestMapping(value = "/Login")
public class LoginWeb 
{
	@Autowired
	LoginService svc;
	
	@RequestMapping(value = "", method =RequestMethod.GET)
	String LoginHome()
	{
		System.out.println("Login start");
		return "Login";		              
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	String login(LoginEntity obj)
	{
		System.out.println("login");
		System.out.println(obj.toString());
		System.out.println(svc.check(obj.userid, obj.pw));
		
		if(svc.check(obj.userid, obj.pw))
			return "index";
		
		else return "redirect:/Login";//Success
	}
}
