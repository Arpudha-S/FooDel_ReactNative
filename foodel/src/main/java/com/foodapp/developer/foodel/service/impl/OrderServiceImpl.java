package com.foodapp.developer.foodel.service.impl;

import com.foodapp.developer.foodel.dto.OrderDetailsDto;
import com.foodapp.developer.foodel.dto.UserDto;
import com.foodapp.developer.foodel.entity.OrderDetails;
import com.foodapp.developer.foodel.entity.User;
import com.foodapp.developer.foodel.exception.ResourceNotFoundException;
import com.foodapp.developer.foodel.mapper.OrderMapper;
import com.foodapp.developer.foodel.mapper.UserMapper;
import com.foodapp.developer.foodel.repository.OrderRepository;
import com.foodapp.developer.foodel.repository.UserRepository;
import com.foodapp.developer.foodel.service.OrderService;
import com.foodapp.developer.foodel.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    @Override
    public OrderDetailsDto createOrder(OrderDetailsDto orderDetailsDto) {
        OrderDetails order= OrderMapper.mapToOrderDetails(orderDetailsDto);
        OrderDetails savedOrder=orderRepository.save(order);
        /*OrderMapper.mapToUserDto(savedUser);
        User user=userRepository.findById(custId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Customer does not exist with given id: "+custId));*/
        return OrderMapper.mapToOrderDetailsDto(order);
    }
}
