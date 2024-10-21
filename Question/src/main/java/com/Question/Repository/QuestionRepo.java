package com.Question.Repository;

import com.Question.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
@RequestMapping
public interface QuestionRepo extends JpaRepository<Question,Integer> {
List<Question> findByCategory(String category);

@Query ("SELECT q.category from Question q GROUP BY q.category")
    List<String> FindallCategory();
}
