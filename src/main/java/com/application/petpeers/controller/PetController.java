package com.application.petpeers.controller;

import java.util.*;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
 

 
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PostMapping;

import com.application.petpeers.model.Owner;
import com.application.petpeers.model.Pet;
import com.application.petpeers.service.OwnerService;
import com.application.petpeers.service.PetService;
 
@Controller
public class PetController {
 
    @Autowired
    private PetService petService;
 
    @Autowired
    private OwnerService ownerService;
 
    @GetMapping("/dashboard")
    public String dashboard(Model model,HttpSession session){
        String loggedInUser = (String) session.getAttribute("loggedInUser");
        if(loggedInUser == null){
            return "redirect:/login";
        }
        model.addAttribute("firstname", loggedInUser);
        return "DashBoard";
    }
 
    @GetMapping("/addPet/new")
    public String petaddPage(Model model) {
        model.addAttribute("p", new Pet());
        return "petForm";
    }
   
    @PostMapping("/addPet")
    public String petAddForm(Model model,@ModelAttribute("p") Pet pet) {
        petService.savePet(pet);
        return "redirect:/addPet/new?success";
    }
   
    @GetMapping("/viewPets")
    public String viewAllPets(Model model) {
        List<Pet> petList = petService.getAllPets();
        model.addAttribute("pets", petList);
        return "viewpets";
    }
   
    @GetMapping("/viewPets/buy/{id}")
    public String buyPet(Model model,@PathVariable Long id,HttpSession session){
        Pet pet = petService.findPetById(id);
        if(pet.getStatus().equalsIgnoreCase("available")){
            pet.setStatus("Unavailable");
            petService.savePet(pet);
            String fname = (String) session.getAttribute("loggedInUser");
            ownerService.saveOwner(new Owner(fname, pet.getPetName()));
            return "redirect:/viewPets?bought";
        }
        return "redirect:/viewPets?error";
    }
   
}