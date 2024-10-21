package com.Question.Service;

import com.Question.Question;
import com.Question.QuestionApplication;
import com.Question.Repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuestionServices {
    @Autowired
 QuestionRepo QuestionRepo;

    public List<Question> getAllQuestions(){
       return QuestionRepo.findAll();
    }
    public List<Question> getbyCategory(String category){
        return QuestionRepo.findByCategory(category);
    }
    public List<String> getCategory(){
        return QuestionRepo.FindallCategory();
    }
    public String addItem(Question question){
         QuestionRepo.save(question);
         return "sucess";
    }
}
