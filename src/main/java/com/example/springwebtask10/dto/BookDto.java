package com.example.springwebtask10.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookDto {
    private String title;
    private String author;
    private String ISBN;
    private int pagesNum;
}
