package com.database.demo.service;

import com.database.demo.domain.Author;
import com.database.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServices implements DatabaseServices {

    @Autowired
    AuthorRepository ar;


    @Override
    public <T> void add(T author) {
        ar.save((Author) author);
    }

    @Override
    public Author get(int id) {
        return ar.findById(id).get();
    }

    @Override
    public void delete(int id) {
        ar.deleteById(id);
    }

    @Override
    public List<Author> getAll() {
        return ar.findAll();
    }

}
