package com.example.teluskototurial.dao;

import com.example.teluskototurial.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionDao extends JpaRepository<Question,Integer> {

    List<Question> findByCategory(String category);

    void deleteByCategory(String category);
    @Query(value = """
select * from Question q where q.category =:category order by random() limit :numQ
""",nativeQuery = true)
    List<Question> findRandomQuestionByCategory(String category, int numQ);
}
