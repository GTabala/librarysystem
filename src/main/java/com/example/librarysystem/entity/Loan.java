package com.example.librarysystem.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "LOANS")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "loan_id")
    private Long id;

    private String userEmail;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "loan_date", nullable = false )
    private Date loanDate;

    @Column(name = "date_to_return", nullable = false )
    private Date dateToReturn;

    @Column(name = "return_date" )
    private Date returnDate;

    public Loan(Book book, String userEmail, Date loanDate, Date dateToReturn) {
        this.book = book;
        this.userEmail = userEmail;
        this.loanDate = loanDate;
        this.dateToReturn = dateToReturn;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getDateToReturn() {
        return dateToReturn;
    }

    public void setDateToReturn(Date dateToReturn) {
        this.dateToReturn = dateToReturn;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
