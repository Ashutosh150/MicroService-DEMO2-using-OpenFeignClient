package com.ashutosh.QuestionService.Services;

import com.ashutosh.QuestionService.Entity.Question;
import com.ashutosh.QuestionService.Repositories.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionSeviceImpl implements QuestionService{

    @Autowired
    private QuestionRepo questionRepo;


    @Override
    public Question createQuestion(Question question) {
        return this.questionRepo.save(question);
    }

    @Override
    public List<Question> getAllQuestions() {
        return this.questionRepo.findAll();
    }

    @Override
    public Question getQuestion(Long id) {
        return this.questionRepo.findById(id).orElseThrow(() -> new RuntimeException("Question not found !!"));
    }


    // custom method
    @Override
    public List<Question> getQuestionsByQuizId(Long quizId) {
        return this.questionRepo.findByQuizId(quizId);
    }
}
