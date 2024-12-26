package com.example.gplx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gplx.entities.Question;
import com.example.gplx.repository.QuestionRepository;

@Service
public class CauHoiService {

	@Autowired
	private QuestionRepository repo;
	
	public List<Question> findAll(){
		return repo.findAll();
	}
}
