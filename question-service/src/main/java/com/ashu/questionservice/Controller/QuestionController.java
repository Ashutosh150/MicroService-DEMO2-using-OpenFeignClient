package com.ashu.questionservice.Controller;

import com.ashu.questionservice.Entites.Question;
import com.ashu.questionservice.Services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;


    //create
    @PostMapping
    public Question creatQuestion(@RequestBody Question question){
        return this.questionService.addQuestion(question);
    }

    //getAllQuestion
    @GetMapping
    public List<Question> getAllQuestions(){
        return this.questionService.getAllQuestion();
    }

    //getQuestion
    @GetMapping("/{id}")
    public Question getQuestion(@PathVariable Long id){
        return this.questionService.getQuestion(id);
    }


    // custom (get all question of specific quizId)
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsByQuizId(@PathVariable Long quizId){

        return this.questionService.getQuestionByQuizId(quizId);
    }


}
