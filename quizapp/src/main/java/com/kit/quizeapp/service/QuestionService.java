package com.kit.quizeapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.kit.quizeapp.dao.QuestionDao;
import com.kit.quizeapp.entity.Question;

@Service
public class QuestionService {
	@Autowired
	private QuestionDao questionDao;

//All Question
	public ResponseEntity<List<Question>> getAllQuestions() {
		try {
			return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
	}

	// By Category
	public ResponseEntity< List<Question>> getQuestionByCategory(String category) {
		try {
			return new ResponseEntity<>( questionDao.findByCategory(category),HttpStatus.OK);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
	}
		


	public ResponseEntity< String> addQuestion(Question question) {
		questionDao.save(question);
		return new ResponseEntity<>("Sucess",HttpStatus.CREATED);
	}
}
