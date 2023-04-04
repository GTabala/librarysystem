package com.example.librarysystem.service;

import com.example.librarysystem.entity.Loan;

import java.util.List;

public interface LoanService {
    List<Loan> listLoans();
    List<Loan> listOverdueLoans();
}
