package com.example.demo.Board.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Board.Entity.BoardEntity;
import com.example.demo.Board.Repository.BoardRepository;


@Service
@Transactional
public class BoardServiceImp implements BoardService
{
	@Autowired
	BoardRepository repo;
	
	BoardServiceImp()
	{
		System.out.println("Constructor Called");
	}
	public List<BoardEntity> findAll()
	{
		System.out.println("BoardServiceImp FindAll Called");
		return repo.findAll();
	}
	
	Optional<BoardEntity> findById(String str)
	{
		return repo.findById(str); 
	}
	
}
