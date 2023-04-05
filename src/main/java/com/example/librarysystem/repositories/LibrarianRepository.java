package com.example.librarysystem.repositories;

import com.example.librarysystem.entities.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrarianRepository extends JpaRepository<Librarian, Long> {
    Librarian findByEmail(String userEmail);
}
