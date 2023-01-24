package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarController{
    @GetMapping
    public CarDTO getCar(){
        return new CarDTO();
    }

    @PostMapping
    public ResponseEntity<String> createCar(@Valid @RequestBody CarDTO carDTO){
        System.out.println(carDTO);
        return new ResponseEntity<>("Created!",HttpStatus.CREATED);
    }
}