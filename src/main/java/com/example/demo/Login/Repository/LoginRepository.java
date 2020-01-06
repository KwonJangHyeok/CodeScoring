package com.example.demo.Login.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Login.Entity.LoginEntity;


@Repository
public interface LoginRepository extends MongoRepository<LoginEntity, String> {

	public List<LoginEntity> findAll();

	public List<LoginEntity> findByUseridAndPw(String userID, String pw);
}
