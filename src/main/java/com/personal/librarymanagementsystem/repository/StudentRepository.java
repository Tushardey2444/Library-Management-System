package com.personal.librarymanagementsystem.repository;

import com.personal.librarymanagementsystem.modals.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}