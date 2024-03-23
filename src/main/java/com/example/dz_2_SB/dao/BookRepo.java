package com.example.dz_2_SB.dao;

import com.example.dz_2_SB.model.Book;

import java.util.List;

public interface BookRepo {
    void addBook(Book book);
    List<Book> findByAll();
//    Book findById(Long id);
//    Book updateBook(Long id);
    void deleteBook();
}
