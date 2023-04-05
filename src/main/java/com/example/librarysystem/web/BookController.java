package com.example.librarysystem.web;

import com.example.librarysystem.entity.Book;
import com.example.librarysystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/available")
    public ResponseEntity<List<Book>> getAvailableBooks() {
        List<Book> list = bookService.availableBooks();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(value = "{title}")
    public ResponseEntity<List<Book>> getBookByTitle(@PathVariable String title) {
        List<Book> list = bookService.getBookByTitle(title);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(value = "{author}")
    public ResponseEntity<List<Book>> getBookByAuthor(@PathVariable String author) {
        List<Book> list = bookService.getBookByAuthor(author);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(value = "{isbn}")
    public ResponseEntity<List<Book>> getBookByIsbn(@PathVariable String isbn) {
        List<Book> list = bookService.getBookByIsbn(isbn);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        return new ResponseEntity<>(bookService.addNewBook(book), HttpStatus.OK);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable final Long id) {
        Book book = bookService.deleteBook(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
}
