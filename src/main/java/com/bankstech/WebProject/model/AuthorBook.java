package com.bankstech.WebProject.model;

import javax.persistence.*;

@Entity(name = "AuthorBook")
@Table(name = "author_book")
public class AuthorBook {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(
            name = "author_book_id",
            updatable = false
    )
    private Long id;

    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @OneToOne
    @JoinColumn( name = "book_id" )
    private Book book;


    public AuthorBook(){}

    public AuthorBook(Long id, Author author, Book book){
        this.id = id;
        this.author = author;
        this.book = book;
    }

    public AuthorBook(Author author, Book book){
        this.author = author;
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "AuthorBook{" +
                "id=" + id +
                ", author=" + author +
                ", book=" + book +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthorBook that = (AuthorBook) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
