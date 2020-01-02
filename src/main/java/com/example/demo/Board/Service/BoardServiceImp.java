package com.example.demo.Board.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Board.Entity.BoardEntity;
import com.example.demo.Board.Repository.BoardRepository;


@Service
public class BoardServiceImp implements BoardService
{
	BoardRepository repo;
	
	List<BoardEntity> findAll()
	{
		return repo.findAll();
	}
	
	Optional<BoardEntity> findById(String str)
	{
		return repo.findById(str); 
	}
	
}
