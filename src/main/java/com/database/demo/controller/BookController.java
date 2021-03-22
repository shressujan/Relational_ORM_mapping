package com.database.demo.controller;

import com.database.demo.domain.Book;
import com.database.demo.service.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookServices bs;

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id) {
        return bs.get(id);
    }

    @PostMapping("/add")
    public void addBook(@RequestBody Book book) {
        bs.add(book);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable int id) {
        bs.delete(id);
    }

}
