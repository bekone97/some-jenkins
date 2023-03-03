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
import org.springframework.data.domain.*;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith({SpringExtension.class})
class UserServiceIUnitTest {

    @Mock
    private UserRepository userRepository;


    @InjectMocks
    private UserServiceImpl userService;

    User user;
    UserDtoResponse userDtoResponse;

    @BeforeEach
    void setUp() {

        user = User.builder()
                .username("Myachin")
                .password("Artsiom")
                .email("myachinenergo@mail.ru")
                .dateOfBirth(LocalDate.now().minusYears(12))
                .build();

        userDtoResponse = UserMapper.INSTANCE.convert(user);
    }

    @AfterEach
    void tearDown() {
        user=null;
        userDtoResponse=null;
    }

//    @Test
//    void findAll() {
//        List<User> userList = List.of(user);
//        Pageable pageable = PageRequest.of(1, 3, Sort.by("username"));
//        Page<User> page = new PageImpl<>(userList, pageable, 1);
//        Page<UserDtoResponse> expected = page.map(user1 -> UserMapper.INSTANCE.convert(user));
//
//        when(userRepository.findAll(pageable)).thenReturn(page);
//
//        Page<UserDtoResponse> actual = userService.findAll(pageable);
//
//        assertEquals(expected, actual);
//        verify(userRepository).findAll(pageable);
//    }
}