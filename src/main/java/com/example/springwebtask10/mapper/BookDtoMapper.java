package com.example.springwebtask10.mapper;

import com.example.springwebtask10.dto.BookDto;
import com.example.springwebtask10.model.Book;

public class BookDtoMapper {
    private static BookDto map(Book book){
        return BookDto.builder()
                .title(book.getTitle())
                .author(book.getAuthor())
                .ISBN(book.getISBN())
                .pagesNum(book.getPagesNum())
                .build();
    }
}
