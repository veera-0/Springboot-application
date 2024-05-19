package com.application.petpeers.service;

import com.application.petpeers.model.User;

public interface UserService {
   public User saveUser(User user);
   User authenticate(String email,String password);
}
