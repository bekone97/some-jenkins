package com.example.somejenkins.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDtoResponse {

    private String username;
    private LocalDate dateOfBirth;

    private String email;


}
