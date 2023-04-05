package com.example.librarysystem.entities;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "LOANS")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "loan_id")
    private Long id;

    @Column(name = "user_email")
    private String userEmail;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "loan_date", nullable = false )
    private LocalDate loanDate;

    @Column(name = "date_to_return", nullable = false )
    private LocalDate dateToReturn;

    @Column(name = "return_date" )
    private LocalDate returnDate;

    private boolean active;
    private boolean overdue;

    public Loan(Book book, String userEmail, long weeks) {
        this.book = book;
        this.userEmail = userEmail;
        this.loanDate = LocalDate.now();
        this.dateToReturn = LocalDate.now().plusWeeks(weeks);
        this.active = true;
        this.overdue = false;
    }

    public Long getId() {
        return id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getDateToReturn() {
        return dateToReturn;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isOverdue() {
        return overdue;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setOverdue(boolean overdue) {
        this.overdue = overdue;
    }
}

