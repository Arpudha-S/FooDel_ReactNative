package com.foodapp.developer.foodel.service.impl;

import com.foodapp.developer.foodel.dto.OrderDetailsDto;
import com.foodapp.developer.foodel.dto.OrderMenuDetailsDto;
import com.foodapp.developer.foodel.entity.OrderDetails;
import com.foodapp.developer.foodel.entity.OrderMenuDetails;
import com.foodapp.developer.foodel.mapper.OrderMapper;
import com.foodapp.developer.foodel.mapper.OrderMenuMapper;
import com.foodapp.developer.foodel.repository.OrderMenuRepository;
import com.foodapp.developer.foodel.repository.OrderRepository;
import com.foodapp.developer.foodel.service.OrderMenuService;
import com.foodapp.developer.foodel.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderMenuServiceImpl implements OrderMenuService {

    private OrderMenuRepository orderMenuRepository;

    @Override
    public OrderMenuDetailsDto createMenuOrder(OrderMenuDetailsDto orderMenuDetailsDto) {
        OrderMenuDetails order= OrderMenuMapper.mapToOrderMenuDetails(orderMenuDetailsDto);
        OrderMenuDetails savedOrder=orderMenuRepository.save(order);
        /*OrderMapper.mapToUserDto(savedUser);
        User user=userRepository.findById(custId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Customer does not exist with given id: "+custId));*/
        return OrderMenuMapper.mapToOrderMenuDetailsDto(order);
    }
}
