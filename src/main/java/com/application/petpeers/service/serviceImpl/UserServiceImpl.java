package com.application.petpeers.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.application.petpeers.model.User;
import com.application.petpeers.repository.UserRepository;
import com.application.petpeers.service.UserService;
 

 
@Service
public class UserServiceImpl implements UserService{
   
    private UserRepository userRepository;
 
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
 
 
    @SuppressWarnings("null")
    @Override
    public User saveUser(User user){
        return userRepository.save(user);
    }
 
    @Override
    public User authenticate(String email,String password){
        User user = userRepository.findByEmail(email);
        if(user!=null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }
}
