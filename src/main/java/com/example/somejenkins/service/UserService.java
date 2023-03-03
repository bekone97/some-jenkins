package com.example.somejenkins.service;

import com.example.somejenkins.dto.UserDtoResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    Page<UserDtoResponse> findAll(Pageable pageable);
}
