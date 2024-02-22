package com.ashutosh.QuizService.Services;
import com.ashutosh.QuizService.Entity.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

// hardCore calling of MicroService using url
//@FeignClient(url = "http://localhost:8082", value = "Question-Client")

// loadbalancing calling of MicroService using Application-Name
@FeignClient(name = "QUESTION-REGISTRY")

public interface QuestionClient {


    // method that will call question service
    @GetMapping("/question/quiz/{quizId}")
    List<Question> getQuestionOfParticularQuiz(@PathVariable Long quizId);

}
