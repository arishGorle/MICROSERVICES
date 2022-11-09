package com.COGNIZANT.PROFILES.controller;

import com.COGNIZANT.PROFILES.exception.BadProfileException;
import com.COGNIZANT.PROFILES.model.User;
import com.COGNIZANT.PROFILES.services.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {

    private  final UserServiceImpl userServiceimpl;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserByIdAction(@PathVariable("id") Long id) throws BadProfileException {
        User model = userServiceimpl.getById(id);
//                getById(ahid);
        return model==null? ResponseEntity.notFound().build() : ResponseEntity.ok(model);
    }
    @GetMapping("/{id}/exists")
    public ResponseEntity<Boolean> existsUserByIdAction(@PathVariable("id") Long id) throws BadProfileException {
        return ResponseEntity.ok(userServiceimpl.existsById(id));
    }

    @PostMapping
    public ResponseEntity<User> addAction(@RequestBody User model) throws BadProfileException{
        return new ResponseEntity<User>(userServiceimpl.add(model), HttpStatus.CREATED);
    }


}