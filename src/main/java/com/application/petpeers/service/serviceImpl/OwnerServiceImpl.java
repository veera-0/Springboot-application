package com.application.petpeers.service.serviceImpl;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.petpeers.model.Owner;
import com.application.petpeers.repository.OwnerRepository;
import com.application.petpeers.service.OwnerService;
 

 
 
@Service
public class OwnerServiceImpl implements OwnerService{
   
    @Autowired
    private OwnerRepository ownerRepository;
 
    // @Autowired
    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }
 
    @SuppressWarnings("null")
    @Override
    public Owner saveOwner(Owner owner) {
        return ownerRepository.save(owner);
    }
 
    @SuppressWarnings("null")
    @Override
    public Owner getById(Long id) {
        return ownerRepository.findById(id).get();
    }
 
    @Override
    public List<Owner> getOwnerPets(String uname) {
        // return ownerRepository.findOwnerByName(uname);
        return ownerRepository.findByOwnerName(uname);
    }
 
}
