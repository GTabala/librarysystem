package com.example.librarysystem.services;

import com.example.librarysystem.entities.Loan;

import java.util.List;

public interface LoanService {
    List<Loan> listLoans();
    List<Loan> listActiveLoans();
    List<Loan> listOverdueLoans();
}
