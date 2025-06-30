package com.dev.serviceApp.dao.impl;

import com.dev.serviceApp.dao.BookDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements BookDao {
    private final JdbcTemplate jdbcTemplate;

    private BookDaoImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
