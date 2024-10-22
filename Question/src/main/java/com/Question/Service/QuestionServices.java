package com.Question.Service;

import com.Question.modal.Question;
import com.Question.Repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> addItem(Question question){
         QuestionRepo.save(question);
         try {
             return new ResponseEntity<String>("Sucess", HttpStatus.CREATED);
         } catch (Exception e){
             e.printStackTrace();
         }
         return new ResponseEntity<>("Bad Request", HttpStatus.BAD_REQUEST);
    }
}
