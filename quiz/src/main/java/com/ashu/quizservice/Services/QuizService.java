package com.ashu.quizservice.Services;

import com.ashu.quizservice.Entity.Quiz;

import java.util.List;

public interface QuizService {

    Quiz add(Quiz quiz);

    List<Quiz> getAllQuiz();

    Quiz getQuiz(Long id);
}
