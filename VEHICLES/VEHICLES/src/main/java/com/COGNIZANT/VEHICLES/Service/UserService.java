package com.COGNIZANT.VEHICLES.Service;

import com.COGNIZANT.VEHICLES.model.User;


public interface UserService {


    User getById(Long id);

    User save(User user);

    Long getlicenceNumberById(Long id);
}

