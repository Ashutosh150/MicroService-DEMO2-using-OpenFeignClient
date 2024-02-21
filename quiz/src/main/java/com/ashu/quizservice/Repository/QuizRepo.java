package com.ashu.quizservice.Repository;

import com.ashu.quizservice.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz, Long> {



}
