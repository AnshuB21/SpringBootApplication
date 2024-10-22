package com.Question.Repository;

import com.Question.modal.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
@RequestMapping
public interface QuestionRepo extends JpaRepository<Question,Integer> {
List<Question> findByCategory(String category);

@Query ("SELECT q.category from Question q GROUP BY q.category")
    List<String> FindallCategory();
    @Query(value ="SELECT * from Question q WHERE q.category=:category ORDER BY RAND() LIMIT :numQ", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory( String category, int numQ);

}
