package com.bankstech.WebProject.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Book")
@Table( name = "book")
public class Book {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(
            name = "book_id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "title",
            nullable = false
    )
    private String title;

    @Column(
            name = "isbn",
            nullable = false
    )
    private String isbn;

    public Book(){}

    public Book(Long id, String title, String isbn){
        this.id = id;
        this.title = title;
        this.isbn = isbn;
    }

    public Book(String title, String isbn){
        this.title = title;
        this.isbn = isbn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return id != null ? id.equals(book.id) : book.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
