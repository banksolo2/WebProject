package com.bankstech.WebProject.repository;

import com.bankstech.WebProject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
