package com.dev.serviceApp.dao;

import com.dev.serviceApp.TestDataUtil;
import com.dev.serviceApp.dao.impl.AuthorDaoImpl;
import com.dev.serviceApp.domain.Authors;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class AuthorDaoImplIntegrationTests {
    private AuthorDaoImpl authorDao;

    @Autowired
    public AuthorDaoImplIntegrationTests(AuthorDaoImpl underTest) {
        this.authorDao = underTest;
    }

    @Test
    public void testThatAuthorCanBeCreatedandRecalled () {
        Authors author = TestDataUtil.getAuthors();
        authorDao.create(author);
        Optional<Authors> result = authorDao.findOne(author.getId());
    assertThat(result).isPresent();
    assertThat(result.get()).isEqualTo(author);


    }
}
