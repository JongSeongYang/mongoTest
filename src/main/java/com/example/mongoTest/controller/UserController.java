package com.example.mongoTest.controller;

import com.example.mongoTest.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/test")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("add")
    public ResponseEntity testUser() {
        userService.addUser();
        return ResponseEntity.ok("ok");
    }
}
