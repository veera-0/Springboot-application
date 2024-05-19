package com.application.petpeers.controller;

 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;

import com.application.petpeers.model.Owner;
import com.application.petpeers.service.OwnerService;

import jakarta.servlet.http.HttpSession;
 
@Controller
public class OwnerController {
   
    @Autowired
    private OwnerService ownerService;
 
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
 
    @GetMapping("yourPets")
    public String viewOwnerPets(Model model,HttpSession session){
        String username = (String) session.getAttribute("loggedInUser");
        List<Owner> pw = ownerService.getOwnerPets(username);
        model.addAttribute("op", pw);
        return "OwnerList";
    }
 
 
}