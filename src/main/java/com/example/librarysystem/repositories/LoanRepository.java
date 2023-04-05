package com.example.librarysystem.repositories;

import com.example.librarysystem.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByUserEmail(String userEmail);
    List<Loan> findByActive(boolean active);
    List<Loan> findByOverdue(boolean overdue);

}
