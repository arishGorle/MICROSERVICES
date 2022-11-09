package com.COGNIZANT.VEHICLES.Service;

import com.COGNIZANT.VEHICLES.exception.BadVehicleException;
import com.COGNIZANT.VEHICLES.model.Vehicle;

import java.util.List;

public interface VehicleService {

//    Txn save(Txn txn) throws BadTxnException;
//    List<Txn> getAllTxns(long ahId,LocalDate from,LocalDate to);

    Vehicle save(Vehicle vehicle) throws BadVehicleException;

    List<Vehicle> getAllVehicleDetails(long bikeid);
}

