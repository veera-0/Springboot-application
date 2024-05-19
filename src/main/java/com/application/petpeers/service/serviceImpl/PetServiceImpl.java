package com.application.petpeers.service.serviceImpl;


 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.petpeers.model.Pet;
import com.application.petpeers.repository.PetRepository;
import com.application.petpeers.service.PetService;

import java.util.*;
 
@Service
public class PetServiceImpl implements PetService{
   
    @Autowired
    private PetRepository petRepository;
 
    public PetServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
 
    @SuppressWarnings("null")
    @Override
    public Pet savePet(Pet pet) {
        return petRepository.save(pet);
    }
 
    @Override
    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }
 
    @SuppressWarnings("null")
    @Override
    public Pet findPetById(Long id) {
        return petRepository.findById(id).get();
    }
}