package com.foodapp.developer.foodel.mapper;

import com.foodapp.developer.foodel.dto.OrderDetailsDto;
import com.foodapp.developer.foodel.dto.UserDto;
import com.foodapp.developer.foodel.entity.OrderDetails;
import com.foodapp.developer.foodel.entity.User;

public class OrderMapper {
    public static OrderDetailsDto mapToOrderDetailsDto(OrderDetails order){
        return new OrderDetailsDto(
                order.getOrderId(),
                order.getCustId(),
                order.getAddress(),
                order.getPhoneNo(),
                order.getOrderDate()
        );
    }

    public static OrderDetails mapToOrderDetails(OrderDetailsDto orderDetailsDto){
        return new OrderDetails(
                orderDetailsDto.getOrderId(),
                orderDetailsDto.getCustId(),
                orderDetailsDto.getAddress(),
                orderDetailsDto.getPhoneNo(),
                orderDetailsDto.getOrderDate()
        );
    }
}
