package com.ashutosh.QuizService.Controller;

import com.ashutosh.QuizService.Entity.Quiz;
import com.ashutosh.QuizService.Services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;


    //to create
    @PostMapping
    public Quiz createQuiz(@RequestBody Quiz quiz){
        return this.quizService.createQuiz(quiz);
    }

    //getAllQuiz
    @GetMapping
    public List<Quiz> getAllQuiz(){
        return this.quizService.getAllQuiz();
    }

    //getQuiz
    @GetMapping("/{id}")
    public Quiz getQuiz(@PathVariable Long id){
        return  this.quizService.getQuiz(id);
    }


}
