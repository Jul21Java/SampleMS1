package com.tekarch.demodb1.repository;

import com.tekarch.demodb1.entity.Bike;
import com.tekarch.demodb1.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
