package com.example.demo.Board.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		model.addAttribute("test",ent);
		return "Board/Boardhome";
		              
	}
	
	
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
