package com.example.EcommerceCar.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue
    private Integer id;
    private String carname;
    private String manufacturedyear;
    @ElementCollection
    private List<String> colours;
    private String model;
    @ElementCollection
    private  List<String>accessories;
    private String price;
    @ElementCollection
    private List<String>paymenttypes;
    @ElementCollection
    private List<String>cities;
}
