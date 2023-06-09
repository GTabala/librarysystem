package com.example.librarysystem.services;

import com.example.librarysystem.entities.Book;

import java.util.List;

public interface BookService {
    List<Book> availableBooks();

    Book addNewBook(Book book);

    Book deleteBook(Long id);

    List<Book> getBookByTitle(String title);

    List<Book> getBookByAuthor(String author);

    List<Book> getBookByIsbn(String isbn);
}
