package com.example.librarysystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "LIBRARIANS")
public class Librarian {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "librarian_id")
    private Long id;

    @Column(unique = true)
    private String email;

    public Librarian(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
