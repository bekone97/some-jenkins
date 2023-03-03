package com.example.somejenkins.mapper;

import com.example.somejenkins.dto.UserDtoResponse;
import com.example.somejenkins.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDtoResponse convert(User user);
}
