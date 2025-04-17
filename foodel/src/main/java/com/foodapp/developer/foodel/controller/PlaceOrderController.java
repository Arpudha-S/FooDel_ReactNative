package com.foodapp.developer.foodel.controller;

import com.foodapp.developer.foodel.dto.OrderDetailsDto;
import com.foodapp.developer.foodel.dto.OrderMenuDetailsDto;
import com.foodapp.developer.foodel.dto.PlaceOrderDto;
import com.foodapp.developer.foodel.dto.UserDto;
import com.foodapp.developer.foodel.service.OrderMenuService;
import com.foodapp.developer.foodel.service.OrderService;
import com.foodapp.developer.foodel.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
@RestController
@RequestMapping("/api/placeorder")
public class PlaceOrderController {
    private OrderService orderService;
    private OrderMenuService orderMenuService;

    @PostMapping("/order")
    public ResponseEntity<?> placeOrder(@RequestBody PlaceOrderDto placeOrderDetails) {
        OrderDetailsDto orderDetailsDto=new OrderDetailsDto();
        orderDetailsDto.setCustId(placeOrderDetails.getCustId());
        orderDetailsDto.setOrderDate(new Date());
        orderDetailsDto.setAddress(placeOrderDetails.getAddress());
        orderDetailsDto.setPhoneNo(placeOrderDetails.getPhoneNo());
        OrderMenuDetailsDto orderMenuDetailsDto=new OrderMenuDetailsDto();

        OrderDetailsDto returnobj= orderService.createOrder(orderDetailsDto);
        for (OrderMenuDetailsDto item : placeOrderDetails.getMenus()){
            item.setOrderId(returnobj.getOrderId());
            orderMenuService.createMenuOrder(item);
        }

        return ResponseEntity.ok("order successfully");
    }
}
