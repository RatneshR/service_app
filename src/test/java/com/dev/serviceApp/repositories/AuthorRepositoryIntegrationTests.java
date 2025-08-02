package com.dev.serviceApp.repositories;

import com.dev.serviceApp.TestDataUtil;
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
public class AuthorRepositoryIntegrationTests {
    private AuthorRepository authorDao;

    @Autowired
    public AuthorRepositoryIntegrationTests(AuthorRepository underTest) {
        this.authorDao = underTest;
    }

//    @Test
//    public void testThatAuthorCanBeCreatedandRecalled () {
//        Authors author = TestDataUtil.createTestAuthorA();
//        authorDao.save(author);
//        Optional<Authors> result = authorDao.findById(author.getId());
//        assertThat(result).isPresent();
//        assertThat(result.get()).isEqualTo(author);
//    }

//    @Test
//    public void testThatMultipleAuthorsCanBeCreatedAndRecalled() {
//        Authors author1 = TestDataUtil.getAuthors();
//        Authors author2 = TestDataUtil.getAuthors();
//        authorDao.create(author1);
//        authorDao.create(author2);
//
//        Optional<Authors> result1 = authorDao.findOne(author1.getId());
//        Optional<Authors> result2 = authorDao.findOne(author2.getId());
//
//        assertThat(result1).isPresent();
//        assertThat(result1.get()).isEqualTo(author1);
//
//        assertThat(result2).isPresent();
//        assertThat(result2.get()).isEqualTo(author2);
//    }

//    @Test
//    public void testThatAuthorCanBeUpdated() {
//        Authors author = TestDataUtil.getAuthors();
//        authorDao.create(author);
//
//        author.setName("Updated Name");
//        authorDao.update(author);
//
//        Optional<Authors> result = authorDao.findOne(author.getId());
//        assertThat(result).isPresent();
//        assertThat(result.get().getName()).isEqualTo("Updated Name");
//    }
//
//    @Test
//    public void testThatAuthorCanBeDeleted() {
//        Authors author = TestDataUtil.getAuthors();
//        authorDao.create(author);
//
//        authorDao.delete(author.getId());
//
//        Optional<Authors> result = authorDao.findOne(author.getId());
//        assertThat(result).isNotPresent();
//    }

}
