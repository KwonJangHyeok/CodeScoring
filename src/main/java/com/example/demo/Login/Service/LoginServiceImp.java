package com.example.demo.Login.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Login.Entity.LoginEntity;
import com.example.demo.Login.Repository.LoginRepository;


@Service
@Transactional
public class LoginServiceImp implements LoginService
{
	@Autowired
	LoginRepository repo;
	
	LoginServiceImp()
	{
		System.out.println("Constructor Called");
	}
	public List<LoginEntity> findAll()
	{
		System.out.println("BoardServiceImp FindAll Called");
		return repo.findAll();
	}
	
	Optional<LoginEntity> findById(String str)
	{
		return repo.findById(str); 
	}
	
	public boolean check(String ID, String PW)
	{
		List<LoginEntity> lst = repo.findByUseridAndPw(ID,PW);
		return lst.size()>0 ?true : false; 
		
	}
}
