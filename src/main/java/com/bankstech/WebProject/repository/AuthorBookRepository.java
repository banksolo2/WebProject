package com.bankstech.WebProject.repository;

import com.bankstech.WebProject.model.Author;
import com.bankstech.WebProject.model.AuthorBook;
import com.bankstech.WebProject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorBookRepository extends JpaRepository<AuthorBook, Long> {

    public boolean existsAuthorBookByAuthorAndBook(Author author, Book book);
}
