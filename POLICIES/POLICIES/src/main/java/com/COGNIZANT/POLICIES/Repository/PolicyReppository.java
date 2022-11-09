package com.COGNIZANT.POLICIES.Repository;

import com.COGNIZANT.POLICIES.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.List;

public interface PolicyReppository extends JpaRepository<Policy,Long> {

    //MYBOKINGS
// @Query("select b from Upolicy b where id = ?1")
//   Policy getpolicybyid(Long id);
}
