package com.database.demo.service;

import com.database.demo.domain.Book;
import com.database.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices implements DatabaseServices{

    @Autowired
    BookRepository br;

    @Override
    public <T> void add(T book) {
        br.save((Book) book);
    }

    @Override
    public Book get(int id) {
        return br.findById(id).get();
    }

    @Override
    public void delete(int id) {
        br.deleteById(id);
    }

    @Override
    public List<Book> getAll() {
        return br.findAll();
    }

}
