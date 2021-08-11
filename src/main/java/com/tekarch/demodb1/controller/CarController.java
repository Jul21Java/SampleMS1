package com.tekarch.demodb1.controller;

import com.tekarch.demodb1.entity.Car;
import com.tekarch.demodb1.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping(value = "/car")
    public List<Car> getCars(){
//        Car c1 = new Car();
//        c1.setColor("white");
//        c1.setName("Vinod's Car");
//        return c1;

        return carRepository.findAll();

    }

    @PostMapping(value ="/car")
    public Car addNewCar(@RequestBody Car c1){
        return carRepository.save(c1);
//        return "New Car Added with name = " + c1.getName();
        
        // changes done by Shankar
    }

}
