package com.COGNIZANT.VEHICLES.controller;

import com.COGNIZANT.VEHICLES.Service.UserService;
import com.COGNIZANT.VEHICLES.Service.VehicleService;
import com.COGNIZANT.VEHICLES.model.Vehicle;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class VehicleController {
    private VehicleService vehicleService;
    private UserService userService;

    @GetMapping("/{Bikeid}")
    public ResponseEntity<List<Vehicle>> getAllVehicleDetails(@PathVariable("Bikeid")long Bikeid){
        return ResponseEntity.ok(vehicleService.getAllVehicleDetails(Bikeid));
    }
//
//    @GetMapping("/{Bikid}")
//    public ResponseEntity<Vehicle> getAllVehicleDetail(@PathVariable("Bikid") Long ahid) throws BadProfileException {
//        Vehicle model = (Vehicle) VehicleService.getAllVehicleDetails(Bikeid);
//        return model==null? ResponseEntity.notFound().build() : ResponseEntity.ok(model);
//    }
}