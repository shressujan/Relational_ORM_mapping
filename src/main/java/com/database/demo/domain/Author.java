package com.database.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private double authorRating;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private Set<Book> books;

    public void setBooks(Set<Book> books) {
        this.books = books;

        for(Book b : books) {
            b.setAuthor(this);
        }
    }
}
