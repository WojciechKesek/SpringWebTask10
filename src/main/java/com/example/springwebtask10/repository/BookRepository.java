package com.example.springwebtask10.repository;

import com.example.springwebtask10.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findBookByTitle(String title);
    Book findBookByISBN(String ISBN);

    Book findBookByAuthorAndISBN(String author, String ISBN);

    List<Book> findTop3ByAuthorOrderByPagesNumDesc(String author);

    List<Book> findBooksByTitleStartingWith(String start);

    List<Book> findBooksByPagesNumBetween(Integer min, Integer max);
}
