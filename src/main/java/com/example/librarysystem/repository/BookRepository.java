package com.example.librarysystem.repository;

import com.example.librarysystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByName (String name);
    List<Book> findByAuthor (String author);
    List<Book> findByISBN (String isbn);

}
