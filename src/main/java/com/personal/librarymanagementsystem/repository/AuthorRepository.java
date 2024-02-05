package com.personal.librarymanagementsystem.repository;

import com.personal.librarymanagementsystem.modals.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
