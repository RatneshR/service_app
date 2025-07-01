package com.dev.serviceApp.dao;

import com.dev.serviceApp.dao.impl.BookDaoImpl;
import com.dev.serviceApp.domain.Books;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.refEq;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
public class BookDaoImplTests {
    // This class is used to test the BookDaoImpl class.
    // It will contain tests for the methods in the BookDaoImpl class.
    // The tests will use Mockito to mock dependencies and verify interactions.

    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private BookDaoImpl underTest;

    @Test
    public void testThatCreateBookGeneratesCorrectSQL() {
        // This is a placeholder for actual test logic.
        // You can add assertions or mock behaviors as needed.
        // For example, you can create a Book object and call the create method on underTest.
        // Then verify that the jdbcTemplate.update method is called with the correct SQL and parameters.

        Books book = Books.builder()
                .isbn("973-1000-1001-1")
                .name("Effective Java")
                .author_id(1L)
                .build();

        underTest.create(book);

        verify(jdbcTemplate).update(
                eq("INSERT INTO books (isbn, name, author_id) VALUES (?, ?, ?)"),
                eq("973-1000-1001-1"),
                eq("Effective Java"),
                eq(1L)
        );
    }
}
