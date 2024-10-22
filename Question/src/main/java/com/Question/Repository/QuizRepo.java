package com.Question.Repository;

import com.Question.modal.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz,Integer> {
}
