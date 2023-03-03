package com.example.somejenkins.service;

import com.example.somejenkins.dto.UserDtoResponse;
import com.example.somejenkins.mapper.UserMapper;
import com.example.somejenkins.model.User;
import com.example.somejenkins.repository.UserRepository;
import com.example.somejenkins.service.impl.UserServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
@ActiveProfiles("test")
class UserServiceIIntegrationTest {

    @Autowired
    private UserService userService;
    List<UserDtoResponse> users;
    @BeforeEach
    void setUp() {
        users = List.of(UserDtoResponse.builder()
                        .username("miachyn")
                        .dateOfBirth(LocalDate.of(1997,06,25))
                        .email("somemeail@mail.ru")
                .build(),
                UserDtoResponse.builder()
                        .username("someName")
                        .dateOfBirth(LocalDate.of(1993,06,25))
                        .email("someanothermeail@mail.ru")
                        .build());
    }

    @AfterEach
    void tearDown() {
        users=null;
    }
//
//    @Test
//    void findAll() {
//        Pageable pageable = PageRequest.of(0, 3, Sort.by("username"));
//        Page<UserDtoResponse> expected = new PageImpl<>(users,pageable,1);
//
//        Page<UserDtoResponse> actual = userService.findAll(pageable);
//
//        assertEquals(expected, actual);
//    }


}