package com.example.springwebtask10.service;

import com.example.springwebtask10.model.Book;
import com.example.springwebtask10.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public List<Book> getAllBooksByTitle(String title){
        return bookRepository.findBookByTitle(title);
    }


    public Book getBookByISBN(String ISBN){
        return bookRepository.findBookByISBN(ISBN);
    }

    public Book getBookByAuthorISBN(String author, String ISBN){
        return bookRepository.findBookByAuthorAndISBN(author, ISBN);
    }

    public List<Book> getThreeLargestBooksBy(String author){
        return bookRepository.findTop3ByAuthorOrderByPagesNumDesc(author);
    }

    public List<Book> getBookThatStartsWith(String start){
        return bookRepository.findBooksByTitleStartingWith(start);
    }

    public List<Book> getBooksWhichPagesAreBetween(Integer min, Integer max){
        return bookRepository.findBooksByPagesNumBetween(min,max);
    }
}
