package com.susforyou.user.controller;

import com.susforyou.user.dto.UserDTO;
import com.susforyou.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO) {
        UserDTO userAdded = userService.saveUser(userDTO);
        return new ResponseEntity<>(userAdded, HttpStatus.CREATED) ;
    }

}
