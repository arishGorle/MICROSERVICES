package com.COGNIZANT.VEHICLES.Service;

import com.COGNIZANT.VEHICLES.Repository.UserRepository;
import com.COGNIZANT.VEHICLES.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.TreeSet;


//import static jdk.internal.logger.LoggerFinderLoader.service;

@Service
public class UserServiceImpl  implements  UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private  UserClient userClient;

    @Override
    public User getById(Long id) {
            User user = userRepository.findById(id).orElse(null);
            if(user==null && userClient.checkForUserById(id)) {
                user=new User();
            }
        return user;
//        User user = userRepository.findById(id).orElse(null);
//        //          if ((user == null)) {
//        if(UserService.(id)) user = new User();
//        return user;
    }



    @Override
    public User save(User user) {
            return userRepository.save(user);
        }

    @Override
    public Long getlicenceNumberById(Long id) {
        User user = userRepository.findById(id).orElse(null);
        assert user != null;
        return getlicenceNumberById(id);
    }

}