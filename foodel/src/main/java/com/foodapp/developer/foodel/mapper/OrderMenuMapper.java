package com.foodapp.developer.foodel.mapper;

import com.foodapp.developer.foodel.dto.OrderDetailsDto;
import com.foodapp.developer.foodel.dto.OrderMenuDetailsDto;
import com.foodapp.developer.foodel.entity.OrderDetails;
import com.foodapp.developer.foodel.entity.OrderMenuDetails;

public class OrderMenuMapper {
    public static OrderMenuDetailsDto mapToOrderMenuDetailsDto(OrderMenuDetails order){
        return new OrderMenuDetailsDto(
                order.getId(),
                order.getOrderId(),
                order.getPrice(),
                order.getQuantity(),
                order.getDishId()
        );
    }

    public static OrderMenuDetails mapToOrderMenuDetails(OrderMenuDetailsDto orderMenuDetailsDto){
        return new OrderMenuDetails(
                orderMenuDetailsDto.getId(),
                orderMenuDetailsDto.getOrderId(),
                orderMenuDetailsDto.getPrice(),
                orderMenuDetailsDto.getDishId(),
                orderMenuDetailsDto.getQuantity()
        );
    }
}
