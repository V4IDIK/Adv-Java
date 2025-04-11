package com.example.SpringBoo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClgService {
	
	@Autowired
	ClgRepo repo;
	
	
	public List<Test1> display(){
	
		return repo.findAll();
	
	}
	
	public void save(Test1 test) {
		
		repo.save(test);
	}
	
	
	
}
