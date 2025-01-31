package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.List;

public class Garage {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @OneToMany(mappedBy = "garage", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Vehicle> vehicles;





}
