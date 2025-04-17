package com.foodapp.developer.foodel.service.impl;

import com.foodapp.developer.foodel.dto.UserDto;
import com.foodapp.developer.foodel.entity.User;
import com.foodapp.developer.foodel.exception.ResourceNotFoundException;
import com.foodapp.developer.foodel.mapper.UserMapper;
import com.foodapp.developer.foodel.repository.UserRepository;
import com.foodapp.developer.foodel.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user= UserMapper.mapToUser(userDto);
        User savedUser=userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getUserById(Long userId) {
        User user=userRepository.findById(userId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee does not exist with given id: "+ userId));
        return UserMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users=userRepository.findAll();
        return users.stream().map((user) ->UserMapper.mapToUserDto(user))
                .collect(Collectors.toList());
    }

    @Override
    public UserDto updateUser(Long userId, UserDto updatedUser) {
        User user=userRepository.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("User does not exist with the given id:" + userId)
        );

        user.setName(updatedUser.getName());
        user.setEmail(updatedUser.getEmail());

        User updatedUserObj=userRepository.save(user);

        return UserMapper.mapToUserDto(updatedUserObj);
    }

    @Override
    public void deleteUser(Long userId) {
        User user=userRepository.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("User does not exist with the given id:" + userId)
        );
        userRepository.deleteById(userId);
    }
}
