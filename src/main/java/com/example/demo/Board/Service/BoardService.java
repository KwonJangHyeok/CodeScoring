package com.example.demo.Board.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Board.Entity.BoardEntity;

public interface BoardService {

	List<BoardEntity> findAll();
	Optional<BoardEntity> findById(String str);
	Object findByNumber(String id);

}
