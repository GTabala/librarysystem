package com.example.librarysystem.service;

import com.example.librarysystem.entity.Loan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanServiceImpl implements LoanService {

    @Override
    public List<Loan> listLoans(){
        return null;
    }
    @Override
    public List<Loan> listActiveLoans(){
        return null;
    }
    @Override
    public List<Loan> listOverdueLoans(){
        return null;
    }

}
