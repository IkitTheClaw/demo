package com.example.demo.repositories;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends org.springframework.data.repository.CrudRepository<User,Long> {
        User findUserById(Long id);

}
