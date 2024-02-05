package com.personal.librarymanagementsystem.repository;

import com.personal.librarymanagementsystem.modals.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<LibraryCard,Integer> {

}
