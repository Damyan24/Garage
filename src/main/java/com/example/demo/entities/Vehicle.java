package com.example.demo.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Vehicle")
public class Vehicle {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String registrationPlate;

    public Vehicle(String registrationPlate) {

        this.registrationPlate = registrationPlate;
    }

    public Vehicle() {

    }


    public String getRegistrationPlate() {
        return registrationPlate;
    }
}
