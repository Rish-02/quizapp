package com.rish.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rish.quiz.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
