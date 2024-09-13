package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.User;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Controller
public class UserController {
    @GetMapping("hello")
    public String test(Model model) {
        User sinhvien1 = new User(95659,"Phạm Hào Nam","28/04/2003","ST21A1B");
        model.addAttribute("id", sinhvien1.getId());
        model.addAttribute("fullName", sinhvien1.getFullName());
        model.addAttribute("dateOfBirth", sinhvien1.getDateOfBirth());
        model.addAttribute("className", sinhvien1.getClassName());
        return "index";
    }
}
