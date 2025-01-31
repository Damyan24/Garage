package com.example.demo.repositories;

import com.example.demo.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {

    @Query("SELECT v FROM Vehicle v WHERE v.registrationPlate = :registration")
    Vehicle findByPlate(@Param("registration")String numberPlate);

}
