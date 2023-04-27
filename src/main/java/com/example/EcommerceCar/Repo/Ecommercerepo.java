package com.example.EcommerceCar.Repo;

import com.example.EcommerceCar.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ecommercerepo extends JpaRepository<Car,Integer> {
}
