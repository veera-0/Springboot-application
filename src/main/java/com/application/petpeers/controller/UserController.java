package com.application.petpeers.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.application.petpeers.model.User;
import com.application.petpeers.service.UserService;
 
 
 
@Controller
public class UserController {
   
    @Autowired
    private UserService userService;
 
    //handler for the homepage
    @GetMapping("/petpeersapplication")
    public String home(Model model) {
        return "index";
    }
   
    //handler to check to login
    @GetMapping("/login")
    public String userLog() {
        return "login";
    }
 
    @PostMapping("/login")
    public String loginSubmit(@RequestParam String username,@RequestParam String password,HttpSession session){
        User user = userService.authenticate(username, password);
        if(user!=null){
            session.setAttribute("loggedInUser", user.getFirstName());
            return "redirect:/dashboard";
        }
        else{
            return "redirect:/login?error";
        }
    }
 
    @GetMapping("/register/new")
    public String registration(Model model) {
        User u = new User();
        model.addAttribute("user",u);
        return "registration";
    }
   
 
    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute("user") User user, Model model,BindingResult bindingResult) {

        if(bindingResult.hasErrors()){
            System.out.println(bindingResult);
            model.addAttribute("user", user);
            return "registration";
        }

        userService.saveUser(user);
        return "redirect:/register/new?success";
    }
   
    @GetMapping("/logout")
    public String logOut(HttpSession session) {
        session.invalidate();
        return "redirect:/petpeersapplication?loggedOut";
    }
   
   
}
