package com.example.bai3.service;

import com.example.bai3.model.User;
import com.example.bai3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository repository;
    public List<User> findallUsers() {
        return (List<User>) repository.findAll();
    }
    public void addUser(User user)
    {
        repository.save(user);
    }
}
