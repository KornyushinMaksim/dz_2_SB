package com.example.dz_2_SB.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
public class Book {
//    private Long id;
    private String name;
    private String author;
    private String publishingHouse;
    private LocalDate publishingDate;
    private int pageCounter;
}
