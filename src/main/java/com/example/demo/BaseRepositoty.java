package com.example.demo;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepositoty<T extends User,ID extends Serializable> extends JpaRepository<T,ID> {
    void delete (T entity);

}
