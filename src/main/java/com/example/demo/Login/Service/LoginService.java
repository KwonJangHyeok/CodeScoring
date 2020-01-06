package com.example.demo.Login.Service;

import java.util.List;

import com.example.demo.Login.Entity.LoginEntity;

public interface LoginService {

	List<LoginEntity> findAll();
	boolean check(String userID, String pW);

}
