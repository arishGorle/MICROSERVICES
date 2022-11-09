package com.COGNIZANT.PROFILES.services;

import com.COGNIZANT.PROFILES.exception.BadProfileException;
import com.COGNIZANT.PROFILES.model.User;


public interface UserService {

    boolean existsById(Long id) throws BadProfileException;
    User getById(Long id) throws BadProfileException;
    User add(User user) throws BadProfileException;

}