package com.example.user_demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.user_demo.entity.Users;

public interface UserRepository extends CrudRepository<Users, Integer> {

}