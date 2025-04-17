package com.foodapp.developer.foodel.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderMenuDetailsDto {
    private Long Id;
    private Long orderId;
    private Long price;
    private Long quantity;
    private String dishId;
}
