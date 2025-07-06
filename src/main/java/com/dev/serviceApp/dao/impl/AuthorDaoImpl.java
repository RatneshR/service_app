package com.dev.serviceApp.dao.impl;

import com.dev.serviceApp.dao.AuthorDao;
import com.dev.serviceApp.domain.Authors;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AuthorDaoImpl implements AuthorDao {
    private final JdbcTemplate jdbcTemplate;

    public AuthorDaoImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Authors author) {
        jdbcTemplate.update(
                "INSERT INTO authors (id, name, age) VALUES (?, ?, ?)",
                author.getId(), author.getName(), author.getAge()
        );
    }

    /**
     * @param id
     */
    @Override
    public Optional<Authors> findOne(Long id) {
//        return Optional.empty();
        List<Authors> authorsList = jdbcTemplate.query(
                "SELECT id, name, age FROM authors WHERE id = ?",
                new AuthorsRowMapper(),
                id
        );

        return authorsList.stream().findFirst();
    }

    public static class AuthorsRowMapper implements RowMapper<Authors> {
        @Override
        public Authors mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
            return Authors.builder()
                    .id(rs.getLong("id"))
                    .name(rs.getString("name"))
                    .age(rs.getInt("age"))
                    .build();
        }
    }
}
