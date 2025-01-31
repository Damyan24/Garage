package com.example.demo.services;

import com.example.demo.entities.Vehicle;
import com.example.demo.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vr ;

    public void addCar(String registration) {

        if (vr.findByPlate(registration) == null) {
            if (vr.findAll().size() == 30) {
                System.out.println("The garage is full!");
            } else {
                vr.save(new Vehicle(registration));
            }
        }else{
            System.out.println("Vehicle is inside");
        }
    }

    public void removeCar(String registration) {
        if(vr.findByPlate(registration) == null) System.out.println("There is no such car");
        else {
            vr.delete(vr.findByPlate(registration));
        }
    }

}
