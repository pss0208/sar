package com.pss.sar.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pss.sar.domain.Car;
import com.pss.sar.domain.CarRepository;

@RestController
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @RequestMapping("/cars")
    public Iterable<Car> getCars(){
        //자동차를 검색하고 반환
        return carRepository.findAll();
    }

}
