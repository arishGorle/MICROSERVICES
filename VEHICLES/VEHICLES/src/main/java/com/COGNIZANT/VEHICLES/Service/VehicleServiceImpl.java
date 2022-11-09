package com.COGNIZANT.VEHICLES.Service;

import com.COGNIZANT.VEHICLES.Repository.VehicleRepository;
import com.COGNIZANT.VEHICLES.exception.BadVehicleException;
import com.COGNIZANT.VEHICLES.model.User;
import com.COGNIZANT.VEHICLES.model.Vehicle;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VehicleServiceImpl implements VehicleService{


    @Autowired
    private VehicleRepository vehicleRepository;
    @Autowired
    private  UserService userService;

    public Vehicle save(Vehicle vehicle) throws BadVehicleException {
//        return vehicleRepository.save(vehicle);
        long id = vehicle.getUser().getId();
        User user = userService.getById(id);

        if(user==null)
            throw new BadVehicleException("vehicle-details can not be attached to an ID does not exits");

        userService.save(user);
        vehicle = vehicleRepository.save(vehicle);
        return vehicle;
    }

    @Override
    public List<Vehicle> getAllVehicleDetails(long Bikeid) {
        return vehicleRepository.getAllTxns(Bikeid);
    }

}