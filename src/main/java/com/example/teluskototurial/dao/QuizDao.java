package com.example.teluskototurial.dao;

import com.example.teluskototurial.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
