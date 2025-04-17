package com.foodapp.developer.foodel.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailsDto {
    private Long orderId;
    private Long custId;
    private String Address;
    private String phoneNo;
    private Date orderDate;
}
