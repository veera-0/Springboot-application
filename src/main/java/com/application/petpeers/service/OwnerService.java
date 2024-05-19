package com.application.petpeers.service;
 
import java.util.List;

import com.application.petpeers.model.Owner;
 

 
public interface OwnerService {
    public Owner saveOwner(Owner owner);
    public Owner getById(Long id);
    public List<Owner> getOwnerPets(String uname);
}
 
