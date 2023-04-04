package com.example.librarysystem.repository;

import com.example.librarysystem.entity.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrarianRepository extends JpaRepository<Librarian, Long> {
    Librarian findByEmail(String userEmail);
}
