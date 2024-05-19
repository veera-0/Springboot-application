package com.application.petpeers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.petpeers.model.User;
 

public interface UserRepository extends JpaRepository<User,Long>{
    User findByEmail(String email);
}
