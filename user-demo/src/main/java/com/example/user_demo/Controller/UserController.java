package com.example.user_demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.user_demo.entity.Users;
import com.example.user_demo.service.UserService;



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
	public String lunchAddBookPage(Model model) {
		model.addAttribute("user", new Users());
		return "add-user";
	}

	@PostMapping("/adduser")
	public String createBook(Users user) {
		service.addUser(user);
		return "redirect:/";

	}

	@GetMapping("/edit/{id}")
	public String lunchEditPage(Model model, @PathVariable("id") int id) {
		model.addAttribute("user", service.findUserById(id));
		return "edit-user";

	}

	@PostMapping("/updateuser")
	public String updateUser(Users user) {
		service.updateUser(user);
		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/";
	}

	@GetMapping("/test")
	public String test() {
		Users st = new Users();
		st.setId(1);
		st.setName("asd23");
		st.setEmail("test123@gmail.com");
		service.addUser(st);
		return "index";
	}
}
