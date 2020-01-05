package com.example.demo.Board.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Board.Entity.BoardEntity;


@Repository
public interface BoardRepository extends MongoRepository<BoardEntity, String> {

	public List<BoardEntity> findAll();
}
