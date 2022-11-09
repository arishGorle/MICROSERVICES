package com.COGNIZANT.VEHICLES.Repository;

import com.COGNIZANT.VEHICLES.model.Vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VehicleRepository  extends JpaRepository<Vehicle,Long> {

   // @Query("SELECT t FROM Vechile t WHERE t.user.id=:id AND t.vehicle_detail")
    @Query("select b from Vehicle b where t.user.id= t.vechile_detail")

//    @Query("SELECT t FROM Txn t WHERE t.holder.ahId=:ahId AND t.dateOfTransaction BETWEEN :from AND :to")
    List<Vehicle> getAllTxns(Long Bikeid);
}