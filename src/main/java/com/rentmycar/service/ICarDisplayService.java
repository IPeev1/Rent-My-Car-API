package com.rentmycar.service;

import com.rentmycar.enums.CarType;
import com.rentmycar.model.CarDisplay;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public interface ICarDisplayService {
    List<CarDisplay> findAll();
    ResponseEntity<CarDisplay> find(Long id);
    ResponseEntity<List<CarDisplay>> findAllByLocation(Long locationId);
    ResponseEntity<List<CarDisplay>> findByDisplayWithType(Long locationId, CarType carType);
    ResponseEntity<List<CarDisplay>> findByDisplay(Long locationId, Long carId);
    CarDisplay create(CarDisplay carDisplay);
    ResponseEntity<CarDisplay> update(CarDisplay newCarDisplay, Long id);
    ResponseEntity<HttpStatus> delete(Long id);
}
