package com.bankstech.WebProject.bootstrap;

import com.bankstech.WebProject.repository.AuthorBookRepository;
import com.bankstech.WebProject.repository.AuthorRepository;
import com.bankstech.WebProject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.bankstech.WebProject.model.*;

import java.sql.SQLOutput;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final AuthorBookRepository authorBookRepository;

    @Autowired
    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, AuthorBookRepository authorBookRepository){
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.authorBookRepository = authorBookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author banks = new Author("Banks","Tech");
        Book java = new Book("Java Programming Language","234566");
        authorRepository.save(banks);
        bookRepository.save(java);
        AuthorBook bj = new AuthorBook(banks,java);
        authorBookRepository.save(bj);

        System.out.println("Started Bootstrap Data..");
    }
}
