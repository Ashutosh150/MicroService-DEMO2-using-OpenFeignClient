package com.ashutosh.QuizService.Services;

import com.ashutosh.QuizService.Entity.Quiz;

import java.util.List;

public interface QuizService {


    Quiz createQuiz(Quiz quiz);

    List<Quiz> getAllQuiz();

    Quiz getQuiz(Long id);

}
