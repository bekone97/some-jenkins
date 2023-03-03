package com.example.somejenkins.controller;

import com.example.somejenkins.dto.UserDtoResponse;
import com.example.somejenkins.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.*;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = UserController.class)
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;


    @MockBean
    private UserService userService;

    private UserDtoResponse userDtoResponse;

    @BeforeEach
    void setUp() {
        userDtoResponse = UserDtoResponse.builder()
                .username("Miachyn")
                .dateOfBirth(LocalDate.now().minusYears(13))
                .email("Myachinenergo@mail.ru")
                .build();
    }

    @AfterEach
    void tearDown() {
        userDtoResponse=null;
    }

//    @Test
//    void findAll() throws Exception {
//        List<UserDtoResponse> userList = List.of(userDtoResponse);
//        Pageable pageable = PageRequest.of(0, 3, Sort.by("username"));
//        Page<UserDtoResponse> expected = new PageImpl<>(userList, pageable, 1);
//        when(userService.findAll(pageable)).thenReturn(expected);
//
//        String actual = mockMvc.perform(MockMvcRequestBuilders.get("/users")
//                        .param("sort","username,asc")
//                        .param("page","0")
//                        .param("size","3"))
//                .andExpect(status().isOk())
//                .andReturn().getResponse().getContentAsString();
//
//        assertEquals(objectMapper.writeValueAsString(expected), actual);
//        verify(userService).findAll(pageable);
//    }
}