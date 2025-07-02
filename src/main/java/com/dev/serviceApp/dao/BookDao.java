package com.dev.serviceApp.dao;

import com.dev.serviceApp.domain.Books;

import java.util.Optional;

public interface BookDao {
    void create(Books book);

    Optional<Books> findOne(String isbn);
}
