package com.dev.serviceApp.repositories;

import com.dev.serviceApp.domain.Authors;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository  extends CrudRepository<Authors, Long> {

    Iterable<Authors> ageLessThan(Integer age);

}
