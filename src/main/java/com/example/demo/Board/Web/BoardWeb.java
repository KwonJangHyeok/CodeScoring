package com.example.demo.Board.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Board.Entity.BoardEntity;
import com.example.demo.Board.Service.BoardServiceImp;
import com.example.demo.Board.Service.BoardService;

@Controller
@RequestMapping(value = "/Board")
public class BoardWeb 
{

	@Autowired
	BoardService svc;
	
	@RequestMapping(value = "")
	String board(Model model)
	{
		System.out.println("Board Home");
		List<BoardEntity> ent = svc.findAll();
		System.out.println(ent.size());
		for(BoardEntity itr : ent)
			System.out.println(""+itr.toString());
		model.addAttribute("Data",ent);
		return "Board/Boardhome";
		              
	}
	
	
	@RequestMapping(value = "/detail/{number}")
	String getContent(@PathVariable String number, Model model)
	{
		System.out.println("getContent");
		System.out.println(svc.findByNumber(number).toString());
		model.addAttribute("Data",svc.findByNumber(number));
		return "Board/BoardDetail";
		//return "Board
	}
	
	@RequestMapping(value = "/runCode")
	void runCode(@RequestParam String content)
	{
		System.out.println(content);
	}
}
