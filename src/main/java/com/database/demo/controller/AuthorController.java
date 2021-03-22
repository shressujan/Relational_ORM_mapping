package com.database.demo.controller;

import com.database.demo.domain.Author;
import com.database.demo.service.AuthorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorServices as;

    @PostMapping("/add")
    public void addAuthor(@RequestBody Author author) {
        as.add(author);
    }

    @GetMapping("/{id}")
    public Author getAuthor(@PathVariable int id) {
        return as.get(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable int id) {
        as.delete(id);
    }

}
