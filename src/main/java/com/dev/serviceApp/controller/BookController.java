package com.dev.serviceApp.controller;

import com.dev.serviceApp.domain.Books;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class BookController {
//    @GetMapping(path = "/books")
//    public Books retireveBook() {
////        log.info("Retrieving book details");
//        return Books.builder()
//                .isbn("978-0134686097")
//                .name("Effective Java")
//                .author("Aria Montogemy")
//                .yearPublished("2005")
//                .build();
//    }

    @PostMapping(path = "/books")
    public Books createBook(Books book) {
//        log.info("Creating book: " + book);
        // Here you would typically save the book to a database
        return book;
    }
}
