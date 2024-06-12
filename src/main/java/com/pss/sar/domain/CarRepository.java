package com.pss.sar.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long>{

    //브랜드로 자동차를 검색
    List<Car> findByBrand(String brand);

    //색상으로 자동차를 검색
    List<Car> findByColor(String Color);

    //연도로 자동차를 검색
    List<Car> findByYear(int year);
}
