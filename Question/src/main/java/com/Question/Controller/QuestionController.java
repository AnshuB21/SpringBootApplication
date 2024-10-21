package com.Question.Controller;
import com.Question.Question;
import com.Question.Service.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionServices questionservice;

    @GetMapping("Questionaire")
    public List<Question> getAllQuestions() {
        return questionservice.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public List<Question> getQuestionByCategory( @PathVariable String category){
        return questionservice.getbyCategory(category);
        }

       @GetMapping("category")
        public List<String> getCategory(){
        return questionservice.getCategory();
        }
     @PostMapping("add")
        public String addElement(@RequestBody Question question){
        return questionservice.addItem(question);
        }
    }

