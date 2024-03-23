package com.example.dz_2_SB.controller;

import com.example.dz_2_SB.model.Book;
import com.example.dz_2_SB.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;


@Controller
@AllArgsConstructor
//@RequestMapping
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/user")
    public String viewAllBook(Model model) {
        List<Book> books = bookService.findByAll();
        model.addAttribute("books", books);
        return "all-books.html";
    }

    @GetMapping("/new")
    public String viewCreateBook() {
        return "add-book";
    }

    @PostMapping("/new")
    public String createBook(@RequestParam String name,
                             @RequestParam String author,
                             @RequestParam String publishingHouse,
                             @RequestParam LocalDate publishingDate,
                             @RequestParam int pageCounter
    ){
        Book book = new Book(name, author, publishingHouse, publishingDate, pageCounter);
        bookService.addBook(book);
        return "redirect:/user";
    }
}
