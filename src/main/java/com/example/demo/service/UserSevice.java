package com.example.demo.service;

import com.example.demo.repositories.UserRepository;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserSevice {
    private final UserRepository userRepository;

    public UserSevice(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User addUser(String name) {
    User user = new User();
    user.setCurrenFirstName(name);
    return userRepository.save(user);
    }

  //  public List<User> getAllUsers() {
  //  return userRepository.findAll();
  //  }
}
