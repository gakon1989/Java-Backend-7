package com.example.bai3.controller;

import com.example.bai3.model.User;
import com.example.bai3.repository.UserRepository;
import com.example.bai3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    UserService service;

    @GetMapping("/")
    public String findAll(Model model) {
        model.addAttribute("users", service.findallUsers());
        return "all-users";
    }

    @GetMapping("/add")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "add-users";
    }

    @PostMapping("/adduser")
    public String createBook(User user) {
        service.addUser(user);
        return "redirect:/";

    }

}
