package com.ashutosh.QuestionService.Repositories;

import com.ashutosh.QuestionService.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepo extends JpaRepository<Question, Long> {

    // custom Method

    List<Question> findByQuizId(Long quizId);

}
