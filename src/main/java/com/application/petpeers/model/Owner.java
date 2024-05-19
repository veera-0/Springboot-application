package com.application.petpeers.model;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
 
@Entity
@Data
@Setter
@Getter
@Table(name="owner")
public class Owner {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @Column(name="ownerName",nullable=false)
    private String ownerName;
 
    @Column(name="ownedPet",nullable=false)
    private String ownedPet;
 
 
    public Owner(){
 
    }
 
    public Owner(String ownerName, String ownedPet) {
        this.ownerName = ownerName;
        this.ownedPet = ownedPet;
    }
 
   
}