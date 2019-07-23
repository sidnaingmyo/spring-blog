package demo.example.blogspring.service;

import demo.example.blogspring.model.Author;

import java.util.List;

public interface Authorservice {

    Author create(Author author);
    Author findById(Long id);
    List<Author> findAll();
}
