package com.example.springwebtask10.controller;

import com.example.springwebtask10.model.Book;
import com.example.springwebtask10.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;
    @GetMapping("/title/{title}")
    public List<Book> getBooksByTitle(@PathVariable String title){
        return bookService.getAllBooksByTitle(title);
    }

    @GetMapping("/isbn/{isbn}")
    public Book getBooksByISBN(@PathVariable("isbn") String isbn){
        return bookService.getBookByISBN(isbn);
    }

    @GetMapping("/{author}")
    public Book getBookByAuthorAndISBN(@PathVariable String author, @RequestParam String ISBN){
        return bookService.getBookByAuthorISBN(author, ISBN);
    }

    @GetMapping("/{author}/top")
    public List<Book> getThreeLargestBooksBy(@PathVariable String author){
        return bookService.getThreeLargestBooksBy(author);
    }

    @GetMapping("/books/{start}")
    public List<Book> getBooksThatStartsWith(@PathVariable String start){
        return bookService.getBookThatStartsWith(start);
    }

    @GetMapping("/books")
    public List<Book> getBooksWhichPagesAreBetween(@RequestParam Integer min, @RequestParam Integer max){
        return bookService.getBooksWhichPagesAreBetween(min, max);
    }
}
