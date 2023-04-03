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

    @ManyToOne
    @JoinColumn(name = "user_id")

    private User user;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "loan_date", nullable = false )
    private Date loanDate;

    @Column(name = "date_to_return", nullable = false )
    private Date dateToReturn;

    @Column(name = "return_date" )
    private Date returnDate;

    public Loan(User user, Date loanDate, Date dateToReturn) {
        this.user = user;
        this.loanDate = loanDate;
        this.dateToReturn = dateToReturn;
    }

    public User getUser() {
        return user;
    }


    public Date getLoanDate() {
        return loanDate;
    }


    public Date getDateToReturn() {
        return dateToReturn;
    }


    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
