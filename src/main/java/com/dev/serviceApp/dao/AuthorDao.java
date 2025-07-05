package com.dev.serviceApp.dao;

import com.dev.serviceApp.domain.Authors;

import java.util.Optional;

public interface AuthorDao {
    void create(Authors author);
    Optional<Authors> findOne(Long id);
}
