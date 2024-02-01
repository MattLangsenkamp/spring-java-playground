package com.mattlangsenkamp.learningspring.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;

import com.mattlangsenkamp.learningspring.model.Content;
import com.mattlangsenkamp.learningspring.model.Status;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content> findAllByTitleContains(String keyword);

    @Query("""
            SELECT * FROM Content
            WHERE status = :status
            """)
    List<Content> listByStatus(Status status);

}
