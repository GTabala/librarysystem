package com.example.librarysystem.service;

import com.example.librarysystem.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> availableBooks();

    Book addNewBook(Book book);

    Book deleteBook(Long id);
}