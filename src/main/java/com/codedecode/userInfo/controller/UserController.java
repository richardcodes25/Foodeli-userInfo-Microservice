package com.codedecode.userInfo.controller;

import com.codedecode.userInfo.dto.UserDTO;
import com.codedecode.userInfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserDTO> fetchUserDetailsById(@PathVariable Integer userId) {
        return userService.fetchAUser(userId); // Status code will be 201
    }

    // Add user to database
    @PostMapping("/addUser")
    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO) {
        UserDTO savedUser = userService.addUser(userDTO);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED); // Status code will be 201
    }

    @GetMapping("/p/getall")
    public List<ResponseEntity<UserDTO>> getAll() {
        return userService.getAll();
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity deleteUser(@PathVariable Integer userId) {
        return userService.deleteUser(userId);
    }

}
