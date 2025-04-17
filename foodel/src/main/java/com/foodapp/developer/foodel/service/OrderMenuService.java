package com.foodapp.developer.foodel.service;

import com.foodapp.developer.foodel.dto.OrderDetailsDto;
import com.foodapp.developer.foodel.dto.OrderMenuDetailsDto;

public interface OrderMenuService {
    OrderMenuDetailsDto createMenuOrder(OrderMenuDetailsDto orderMenuDetailsDto);

}
