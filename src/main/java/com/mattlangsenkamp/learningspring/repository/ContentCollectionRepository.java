package com.mattlangsenkamp.learningspring.repository;

import com.mattlangsenkamp.learningspring.model.*;

import jakarta.annotation.PostConstruct;

import java.util.List;
import java.util.Optional;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {

    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public void save(Content content) {
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }

    public boolean existsById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).findAny().isPresent();
    }

    @PostConstruct
    private void init() {
        Content c = new Content(
                1,
                "null",
                "cool desc",
                Status.IN_PROGRESS,
                Type.ARTICLE,
                LocalDateTime.now(),
                LocalDateTime.now(),
                "wow");
        contentList.add(c);
    }

}
