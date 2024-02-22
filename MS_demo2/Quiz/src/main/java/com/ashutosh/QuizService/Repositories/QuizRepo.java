package com.ashutosh.QuizService.Repositories;

import com.ashutosh.QuizService.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz, Long> {


}
