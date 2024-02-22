package com.ashutosh.QuizService.Services;

import com.ashutosh.QuizService.Entity.Quiz;
import com.ashutosh.QuizService.Repositories.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceIMPL implements QuizService{

    @Autowired
    private QuizRepo quizRepo;

    @Autowired
    private QuestionClient questionClient;


    @Override
    public Quiz createQuiz(Quiz quiz) {
        return this.quizRepo.save(quiz);
    }

    @Override
    public List<Quiz> getAllQuiz() {
        List<Quiz> quizzes = this.quizRepo.findAll();

        List<Quiz> newQuizList = quizzes.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQuestionOfParticularQuiz(quiz.getId()));

            return quiz;

        }).collect(Collectors.toList());

        return newQuizList;
    }

    @Override
    public Quiz getQuiz(Long id) {
        Quiz quiz = this.quizRepo.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found !!"));

        quiz.setQuestions(questionClient.getQuestionOfParticularQuiz(quiz.getId()));

        return quiz;
    }
}
