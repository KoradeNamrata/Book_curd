package com.sprk.book_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprk.book_crud.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}