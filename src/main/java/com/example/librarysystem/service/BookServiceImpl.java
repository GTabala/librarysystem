package com.example.librarysystem.service;

import com.example.librarysystem.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public List<Book> availableBooks(){
        return null;
    }
    @Override
    public Book addNewBook(Book book){
        return null;
    }
    @Override
    public Book deleteBook(Long id){
        return null;
    }
    @Override
    public List<Book> getBookByTitle(String title){
        return null;
    }

    @Override
    public List<Book> getBookByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> getBookByIsbn(String isbn) {
        return null;
    }

}
