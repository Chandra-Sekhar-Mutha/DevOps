package com.example.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.test.entity.User;

/*public interface UserRepository extends CrudRepository<User, Long>, RevisionRepository<User, Long, Integer> {

}*/

public interface UserRepository extends CrudRepository<User, Long> {

}
