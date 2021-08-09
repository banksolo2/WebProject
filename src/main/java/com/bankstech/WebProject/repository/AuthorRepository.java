package com.bankstech.WebProject.repository;

import com.bankstech.WebProject.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
