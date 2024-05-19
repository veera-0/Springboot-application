package com.application.petpeers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.petpeers.model.Pet;
 

 
public interface PetRepository extends JpaRepository<Pet,Long>{
   
}
