package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @Autowired
    private final EntityManager entityManager;

    public UserDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public User getUserById(Long id) {
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, id);
        entityManager.getTransaction().commit();
        System.out.println(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "FROM User";

        TypedQuery<User> query = entityManager.createQuery(sql, User.class);
        entityManager.getTransaction().begin();
        List<User> userList = query.getResultList();
        entityManager.getTransaction().commit();
        return userList;
    }
}
