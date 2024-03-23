package com.example.dz_2_SB.service;

import com.example.dz_2_SB.dao.BookRepo;
import com.example.dz_2_SB.model.Book;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService implements BookRepo {

    private List<Book> books;

    @Override
    public void addBook(Book book) {
        this.books.add(book);
    }

    @Override
    public List<Book> findByAll() {
        return this.books;
    }

//    @Override
//    public Book findById(Long id) {
//        return getBook(id);
//    }
//
//    @Override
//    public Book updateBook(Long id) {
//        return getBook(id);
//    }

    @Override
    public void deleteBook() {

    }

//    private Book getBook(Long id) {
//        for (Book book : this.books) {
//            if (book.getId() == id) {
//                return book;
//            }
//        }
//        return null;
//    }
}
