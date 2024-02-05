package com.personal.librarymanagementsystem.repository;

import com.personal.librarymanagementsystem.modals.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}