package com.example.EcommerceCar.Controller;

import com.example.EcommerceCar.Model.Car;
import com.example.EcommerceCar.Service.Ecommerceservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class Ecommercecontroller {
    @Autowired
    private Ecommerceservice ecommerceservice;
    @PostMapping("/addcar")
    public Car addcar(@RequestBody Car car){
        return ecommerceservice.addCar(car);
    }
    @GetMapping("/get")
    public List<Car> getcar(){
        return ecommerceservice.getAllcar();
    }
}
