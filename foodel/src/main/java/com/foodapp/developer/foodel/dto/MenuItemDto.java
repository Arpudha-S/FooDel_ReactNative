package com.foodapp.developer.foodel.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemDto {
    private Long id;
    private String Name;
    private String image;
    private long price;
    private String dishId;
}
