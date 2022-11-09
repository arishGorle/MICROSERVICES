package com.COGNIZANT.PROFILES.services;

import com.COGNIZANT.PROFILES.exception.BadProfileException;
import com.COGNIZANT.PROFILES.model.User;
import com.COGNIZANT.PROFILES.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl  implements  UserService {

    private final UserRepository userRepository;

    @Override
    public boolean existsById(Long id) throws BadProfileException {
        return userRepository.existsById(id);
    }

    @Override
    public User getById(Long id) throws BadProfileException {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User add(User user) throws BadProfileException {
        if (user.getId() != null && userRepository.existsById(user.getId()))
            throw new BadProfileException("Record Exists Already");
        return userRepository.save(user);
    }
}