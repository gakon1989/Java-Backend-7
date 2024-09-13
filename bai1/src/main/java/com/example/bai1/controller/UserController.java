package com.example.bai1.controller;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bai1.model.User;








@RestController
@RequestMapping("/trangchu")
public class UserController {
    private ConcurrentHashMap<String, User> users;
    public UserController() {
        users = new ConcurrentHashMap<>();
        users.put("95659", new User("95659", "Hao Nam", 2003, "ST21A1B"));
        users.put("09321", new User("09321", "Le van quyen", 2003, "ST21A1B"));
    }
    @GetMapping
    public List<User> getUser() {
        return users.values().stream().toList();
    }
}
