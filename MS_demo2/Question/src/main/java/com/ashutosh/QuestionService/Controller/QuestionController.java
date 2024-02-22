package com.ashutosh.QuestionService.Controller;

import com.ashutosh.QuestionService.Entity.Question;
import com.ashutosh.QuestionService.Services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")

public class QuestionController {

    @Autowired
    private QuestionService questionService;


    //to create
    @PostMapping
    public Question createQuestion(@RequestBody Question question){
        return this.questionService.createQuestion(question);
    }

    //getAllQuiz
    @GetMapping
    public List<Question> getAllQuestion(){
        return this.questionService.getAllQuestions();
    }

    //getQuiz
    @GetMapping("/{id}")
    public Question getQuiz(@PathVariable Long id){
        return  this.questionService.getQuestion(id);
    }


    // custom Method(get all question belonging to 1 specific quizid)
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsByQuizId(@PathVariable Long quizId){
        return this.questionService.getQuestionsByQuizId(quizId);
    }


}
