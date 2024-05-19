package com.application.petpeers.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.application.petpeers.model.Owner;

import java.util.List;
 
 
public interface OwnerRepository extends JpaRepository<Owner,Long>{
    // List<Owner> findOwnerByName(String uname);
    List<Owner> findByOwnerName(String ownerName);
}
