package com.Question.Controller;

import com.Question.Service.quizService;
import com.Question.modal.Question;
import com.Question.modal.QuestionWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Quiz")
public class QuizController {
    @Autowired
    quizService quizService;
    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title){
      return quizService.createQuiz(category,numQ,title);
    }
@GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions (@PathVariable Integer id){
        return quizService.getQuizQuestions(id);
    }
}
