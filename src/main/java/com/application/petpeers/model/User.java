package com.application.petpeers.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
 
@Entity
@Data
@Setter
@Getter
@Table(name="users")
public class User {
   
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
 
    @NotBlank(message = "First name is required")
    private String firstName;
 
    @NotBlank(message = "Last Name is required")
    private String lastName;
 
    @NotBlank(message = "Phone number is required")
    @Pattern(regexp="(^$|[0-9]{10})", message = "Invalid phone number")
    private String phone;
 
    @Column(unique = true)
     @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;
 
    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;
 
    public User(String firstName, String lastName, String phone, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }
 
    public User(){
 
    }
 
}