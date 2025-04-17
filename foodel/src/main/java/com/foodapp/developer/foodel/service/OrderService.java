package com.foodapp.developer.foodel.service;

import com.foodapp.developer.foodel.dto.OrderDetailsDto;
import com.foodapp.developer.foodel.dto.UserDto;

import java.util.List;

public interface OrderService {
    OrderDetailsDto createOrder(OrderDetailsDto orderDetailsDto);

}
