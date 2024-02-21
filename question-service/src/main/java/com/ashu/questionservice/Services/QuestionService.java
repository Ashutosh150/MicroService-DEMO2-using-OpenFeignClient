package com.ashu.questionservice.Services;

import com.ashu.questionservice.Entites.Question;

import java.util.List;

public interface QuestionService {

    Question addQuestion(Question question);

    List<Question> getAllQuestion();

    Question getQuestion(Long id);

    //custom
    List<Question> getQuestionByQuizId(Long quizId);

}
