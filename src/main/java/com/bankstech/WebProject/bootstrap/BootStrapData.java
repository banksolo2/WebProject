package com.bankstech.WebProject.bootstrap;

import com.bankstech.WebProject.repository.AuthorRepository;
import com.bankstech.WebProject.repository.BookRepository;
import com.bankstech.WebProject.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.bankstech.WebProject.model.*;

import java.util.HashSet;
import java.util.Set;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Autowired
    public BootStrapData(AuthorRepository authorRepository,
                         BookRepository bookRepository,
                         PublisherRepository publisherRepository){
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author banks = new Author("Banks","Tech");
        Book java = new Book("Java Programming Language","234566");
        authorRepository.save(banks);
        bookRepository.save(java);
        System.out.println(banks.toString());
        Set<Book> setBooks = new HashSet<Book>();
        setBooks.add(java);
        banks.setBooks(setBooks);
        Set<Author> setAuthors = new HashSet<Author>();
        setAuthors.add(banks);
        java.setAuthors(setAuthors);

        authorRepository.save(banks);
        bookRepository.save(java);

        Author seun = new Author("Oluwaseun","Olotu");
        Book php = new Book("PHP Programming Language","3467886");
        authorRepository.save(seun);
        bookRepository.save(php);
        Set<Book> bookSet2 = new HashSet<Book>();
        bookSet2.add(php);
        Set<Author> authorSet2 = new HashSet<Author>();
        authorSet2.add(seun);
        seun.setBooks(bookSet2);
        php.setAuthors(authorSet2);
        authorRepository.save(seun);
        bookRepository.save(php);

        Publisher david = new Publisher();
        david.setName("David John");
        david.setAddressLine("Blk 103, Flt 3, Plt 56, Zone A, Iba Housing Estate");
        david.setCity("Iba");
        david.setState("Lagos");
        david.setZip("2345");
        Set<Book> bookSet3 = new HashSet<Book>();
        bookSet3.add(java);
        bookSet3.add(php);
        david.setBooks(bookSet3);
        publisherRepository.save(david);

        //update book
        java.setPublisher(david);
        php.setPublisher(david);
        bookRepository.save(java);
        bookRepository.save(php);

        System.out.println("Started Bootstrap Data..");
        System.out.println("Number of Authors: "+authorRepository.count());
        System.out.println("Number of Books: "+ bookRepository.count());
        System.out.println("Number of Publishers: "+ publisherRepository.count());
    }
}
