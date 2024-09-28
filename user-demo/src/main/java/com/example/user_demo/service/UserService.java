package com.example.user_demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user_demo.entity.Users;
import com.example.user_demo.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public List<Users> findallUsers() {
		return (List<Users>) repository.findAll();
	}

	public Users findUserById(int id) {
		Optional<Users> result = repository.findById(id);
		if (result.isPresent()) {
			return result.get();
		}
		return new Users();
	}

	public Users addUser(Users user) {
		return repository.save(user);
	}

	public Users updateUser(Users user) {
		Optional<Users> result = repository.findById(user.getId());
		Users existing = result.get();
		existing.setName(user.getName());
		existing.setEmail(user.getEmail());
		return repository.save(existing);
	}

	public void deleteById(int id) {
		repository.deleteById(id);
	}
}
