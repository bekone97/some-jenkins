package com.example.somejenkins.controller;

import com.example.somejenkins.dto.UserDtoResponse;
import com.example.somejenkins.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @GetMapping
    @ResponseStatus(OK)
    public Page<UserDtoResponse> findAll(Pageable pageable) {
        return userService.findAll(pageable);
    }
}
