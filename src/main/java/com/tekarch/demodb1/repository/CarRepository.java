package com.tekarch.demodb1.repository;

import com.tekarch.demodb1.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
