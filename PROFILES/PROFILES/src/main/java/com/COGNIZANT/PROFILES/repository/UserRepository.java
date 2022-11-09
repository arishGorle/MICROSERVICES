package com.COGNIZANT.PROFILES.repository;

import com.COGNIZANT.PROFILES.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {
}
