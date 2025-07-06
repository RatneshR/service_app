package com.dev.serviceApp;

import com.dev.serviceApp.domain.Authors;

public final class TestDataUtil {
    private TestDataUtil() {
        // Private constructor to prevent instantiation
    }

    public static Authors getAuthors() {
        Authors author = Authors.builder()
                .id(1L)
                .name("John Dao")
                .age(30)
                .build();
        return author;
    }

}
