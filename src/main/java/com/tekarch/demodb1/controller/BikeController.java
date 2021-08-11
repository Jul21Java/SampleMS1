package com.tekarch.demodb1.controller;

import com.tekarch.demodb1.entity.Bike;
import com.tekarch.demodb1.entity.Car;
import com.tekarch.demodb1.repository.BikeRepository;
import com.tekarch.demodb1.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BikeController {

    @Autowired
    private BikeRepository bikeRepository;

    @GetMapping(value = "/bike")
    public List<Bike> getBikes(string name){
        return bikeRepository.findAll();
    }

    @PostMapping(value ="/bike")
    public Bike addNewCar(@RequestBody Bike c1){
        return bikeRepository.save(c1);

        // my second change for bike feature

        // some code added in BikeController
//        return "New Car Added with name = " + c1.getName();
        
        // changes done by Vinotha....
    }

}
