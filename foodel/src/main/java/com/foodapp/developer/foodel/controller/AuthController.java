package com.foodapp.developer.foodel.controller;

import com.foodapp.developer.foodel.dto.UserDto;
import com.foodapp.developer.foodel.entity.User;
import com.foodapp.developer.foodel.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserDto userDetails) {
        // Logic for registering user check
        List<UserDto> users = userService.getAllUsers();
        for(UserDto lusr:users){
            if (lusr.getEmail().compareToIgnoreCase(userDetails.getEmail())==0)
            {
                return ResponseEntity.ok("already exist");
            }
        }

         userService.createUser(userDetails);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody UserDto loginRequest) {
        // Logic for authenticating user
        List<UserDto> users = userService.getAllUsers();
        for(UserDto lusr:users){
            if (lusr.getEmail().compareToIgnoreCase(loginRequest.getEmail())==0 &&
                    lusr.getPwd().compareTo(loginRequest.getPwd())==0)
            {
                return ResponseEntity.ok(lusr.getId());
            }
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
    }


}
