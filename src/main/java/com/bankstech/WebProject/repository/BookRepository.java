package com.bankstech.WebProject.repository;

import com.bankstech.WebProject.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
