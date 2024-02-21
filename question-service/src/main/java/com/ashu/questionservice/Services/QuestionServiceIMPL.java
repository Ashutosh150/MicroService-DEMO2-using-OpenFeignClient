package com.ashu.questionservice.Services;

import com.ashu.questionservice.Entites.Question;
import com.ashu.questionservice.Repositories.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuestionServiceIMPL implements QuestionService{

    @Autowired
    private QuestionRepo questionRepo;

    @Override
    public Question addQuestion(Question question) {
        return this.questionRepo.save(question);
    }

    @Override
    public List<Question> getAllQuestion() {
        return this.questionRepo.findAll();
    }

    @Override
    public Question getQuestion(Long id) {
        return this.questionRepo.findById(id).orElseThrow(() -> new RuntimeException("Question Not Found !!"));
    }


    // custom

    @Override
    public List<Question> getQuestionByQuizId(Long quizId) {


        return this.questionRepo.findByQuizId(quizId);
    }
}
