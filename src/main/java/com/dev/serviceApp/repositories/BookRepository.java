package com.dev.serviceApp.repositories;

import com.dev.serviceApp.domain.Books;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books, String> {

    // Additional query methods can be defined here if needed
    // For example, to find books by author name:
    // List<Books> findByAuthorName(String authorName);
}
