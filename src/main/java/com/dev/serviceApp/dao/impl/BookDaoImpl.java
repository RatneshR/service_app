package com.dev.serviceApp.dao.impl;

import com.dev.serviceApp.dao.BookDao;
import com.dev.serviceApp.domain.Books;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements BookDao {
    private final JdbcTemplate jdbcTemplate;

    private BookDaoImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Books book) {
        jdbcTemplate.update(
                "INSERT INTO books (isbn, name, author_id) VALUES (?, ?, ?)",
                book.getIsbn(), book.getName(), book.getAuthor_id()
        );
    }
}
