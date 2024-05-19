package com.application.petpeers.service;

import java.util.List;
 

import com.application.petpeers.model.Pet;
 
public interface PetService {
 
    public Pet savePet(Pet pet);
    public List<Pet> getAllPets();
    public Pet findPetById(Long id);
}
