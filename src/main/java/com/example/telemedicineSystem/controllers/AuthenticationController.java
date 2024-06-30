package com.example.telemedicineSystem.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/authentication")
@RequiredArgsConstructor
public class AuthenticationController {
    /*@PostMapping("/auth/register")
    public ResponseEntity<?> registerNewUser(@RequestBody RegisterUserDto registerUserDto) throws InputDataErrorException {
        userService.createNewUser(registerUserDto);
        return ResponseEntity.ok(new StringResponse("User with nickname " + registerUserDto.getUsername()
                + " is successfully signed up"));
    }*/
}
