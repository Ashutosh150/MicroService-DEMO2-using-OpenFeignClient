package com.ashutosh.QuestionService.Services;

import com.ashutosh.QuestionService.Entity.Question;

import java.util.List;

public interface QuestionService {


    Question createQuestion(Question question);

    List<Question> getAllQuestions();

    Question getQuestion(Long id);


    // custom method
    List<Question> getQuestionsByQuizId(Long quizId);


}
