package com.dev.serviceApp.dao.impl;

import com.dev.serviceApp.dao.BookDao;
import com.dev.serviceApp.domain.Books;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

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

    /**
     * @param isbn
     * @return
     */
    @Override
    public Optional<Books> findOne(String isbn) {
//        return Optional.empty();
        List<Books> booksList = jdbcTemplate.query(
                "SELECT isbn, name, author_id FROM books WHERE isbn = ? LIMIT 1",
                new BooksRowMapper(),
                isbn
        );
        return booksList.stream().findFirst();
    }

    public static class BooksRowMapper implements RowMapper<Books> {
        @Override
        public Books mapRow(ResultSet rs, int rowNum) throws java.sql.SQLException {
            return Books.builder()
                    .isbn(rs.getString("isbn"))
                    .name(rs.getString("name"))
                    .author_id(rs.getLong("author_id"))
                    .build();
        }
    }
}
