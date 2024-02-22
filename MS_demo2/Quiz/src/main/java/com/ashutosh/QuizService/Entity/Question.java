package com.ashutosh.QuizService.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Question {

    private Long id;

    private String question;

    private Long quizId;

}