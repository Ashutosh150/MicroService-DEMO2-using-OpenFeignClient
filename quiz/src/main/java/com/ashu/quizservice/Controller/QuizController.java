package com.ashu.quizservice.Controller;

import com.ashu.quizservice.Entity.Quiz;
import com.ashu.quizservice.Services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    //create
    @PostMapping
    public Quiz createQuiz(@RequestBody Quiz quiz){
        return this.quizService.add(quiz);
    }

    //getAllQuiz
    @GetMapping
    public List<Quiz> getAllQuiz(){
        return this.quizService.getAllQuiz();
    }

    //getQuiz
    @GetMapping("/{id}")
    public Quiz getQuiz(@PathVariable Long id){
        return this.quizService.getQuiz(id);
    }


}
