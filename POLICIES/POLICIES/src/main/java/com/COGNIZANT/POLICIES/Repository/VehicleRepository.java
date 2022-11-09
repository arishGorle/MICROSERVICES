package com.COGNIZANT.POLICIES.Repository;

import com.COGNIZANT.POLICIES.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
}
