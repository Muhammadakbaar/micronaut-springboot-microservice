package com.microservice.repository;

import com.microservice.entity.User;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {
    User findByUserId(Long userId);
}
