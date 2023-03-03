package com.example.somejenkins.service.impl;

import com.example.somejenkins.dto.UserDtoResponse;
import com.example.somejenkins.mapper.UserMapper;
import com.example.somejenkins.repository.UserRepository;
import com.example.somejenkins.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public Page<UserDtoResponse> findAll(Pageable pageable) {
        return userRepository.findAll(pageable)
                .map(UserMapper.INSTANCE::convert);
    }
}
