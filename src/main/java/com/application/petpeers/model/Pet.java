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
@Table(name="pets")
@Data
@Setter
@Getter
public class Pet {
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
 
    @Column(name="pet_name",nullable = false)
    private String petName;
 
    @Column(name = "age")
    private Long age;
 
    @Column(name = "status",nullable = false)
    private String status;
 
    public Pet(String petName, String status) {
        this.petName = petName;
        this.status = status;
    }
 
    public Pet(){
       
    }
}