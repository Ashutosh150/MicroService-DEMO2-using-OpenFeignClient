package com.ashutosh.QuizService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;


    // transient use kiya gaya h koiki yeh property ko DB mein data store krne ke liye nhi usee krr rahe h hum, infACT it is used to display result in o/p
    transient private List<Question> questions;

}
