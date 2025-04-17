package com.foodapp.developer.foodel.mapper;

import com.foodapp.developer.foodel.dto.UserDto;
import com.foodapp.developer.foodel.entity.User;

public class UserMapper {
    public static UserDto mapToUserDto(User user){
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPwd()
        );
    }

    public static User mapToUser(UserDto userDto){
        return new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getEmail(),
                userDto.getPwd()
        );
    }
}
