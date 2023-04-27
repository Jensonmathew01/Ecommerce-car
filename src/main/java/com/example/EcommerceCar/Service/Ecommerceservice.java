package com.example.EcommerceCar.Service;

import com.example.EcommerceCar.Model.Car;
import com.example.EcommerceCar.Repo.Ecommercerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Ecommerceservice {
    @Autowired
    private Ecommercerepo ecommercerepo;
    public Car addCar(Car car) {
       return ecommercerepo.save(car);
    }

    public List<Car> getAllcar() {
        return ecommercerepo.findAll();
    }
}
