package com.example.springwebtask10.command;

import com.example.springwebtask10.model.Book;
import com.example.springwebtask10.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookCommand implements CommandLineRunner {
    private final BookRepository bookRepository;
    @Override
    public void run(String... args) throws Exception {
        Book book = new Book();
        book.setTitle("test");
        book.setAuthor("testAuthor");
        book.setISBN("testISBN");
        book.setPagesNum(2);
        bookRepository.save(book);
    }
}
