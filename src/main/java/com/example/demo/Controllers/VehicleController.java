package com.example.demo.Controllers;


import com.example.demo.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @Autowired
    VehicleService vs;


    @GetMapping(value = "/add/{plate}")
    public void addCar(@PathVariable String plate){

        vs.addCar(plate);
    }

    @GetMapping(value = "/remove/{plate}")
    public void removeCar(@PathVariable String plate){

        vs.removeCar(plate);
    }






}
