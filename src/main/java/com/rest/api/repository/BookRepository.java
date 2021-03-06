package com.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.api.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	
}
