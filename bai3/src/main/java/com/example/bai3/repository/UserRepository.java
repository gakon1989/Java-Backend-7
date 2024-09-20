package com.example.bai3.repository;

import com.example.bai3.model.User;


import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>
{
}