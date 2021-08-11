package com.tekarch.demodb1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Bike {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;


    private String name;
    private String color;
    private String brandName;

    // my 3rd change
}
