package com.ashu.quizservice.Services;

import com.ashu.quizservice.Entity.Question;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url = "http://localhost:8082", value = "Question-Client")

// for load-balancing
@FeignClient(name = "QUESTION-SERVICE")

public interface QuestionClient {


    // method that will communication with Question-service

    @GetMapping("/question/quiz/{quizId}")
    List<Question> getQuestionOfQuiz(@PathVariable Long quizId);


}
