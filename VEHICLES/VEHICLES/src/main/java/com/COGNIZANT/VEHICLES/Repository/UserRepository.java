package com.COGNIZANT.VEHICLES.Repository;

import com.COGNIZANT.VEHICLES.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository  extends JpaRepository<User,Long> {
//  @Query("select b from User_details b where id = ?1")
//  User getById(Long id);
}