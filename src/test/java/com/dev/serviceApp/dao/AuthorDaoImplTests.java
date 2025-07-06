package com.dev.serviceApp.dao;

import com.dev.serviceApp.TestDataUtil;
import com.dev.serviceApp.dao.impl.AuthorDaoImpl;
import com.dev.serviceApp.domain.Authors;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AuthorDaoImplTests {
    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private AuthorDaoImpl underTest;

    @Test
    public void testAuthorDaoImpl() {
        // This is a placeholder for actual test logic.
        // You can add assertions or mock behaviors as needed.
        Authors author = TestDataUtil.getAuthors();

        underTest.create(author);

        verify(jdbcTemplate).update(
                eq("INSERT INTO authors (id, name, age) VALUES (?, ?, ?)"),
                eq(1L), eq("John Dao"), eq(30)
        );
    }


    @Test
    public void testThatFindOneGeneratesTheCorrectSQL() {
        underTest.findOne(1L);
        verify(jdbcTemplate).query(
                eq("SELECT id, name, age FROM authors WHERE id = ?"),
                ArgumentMatchers.<AuthorDaoImpl.AuthorsRowMapper>any(),
                eq(1L)
        );
    }
}
