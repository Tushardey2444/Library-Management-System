package com.personal.librarymanagementsystem.repository;

import com.personal.librarymanagementsystem.modals.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,String> {

}
