package com.foodapp.developer.foodel.service;

import com.foodapp.developer.foodel.dto.MenuItemDto;
import com.foodapp.developer.foodel.dto.UserDto;

import java.util.List;

public interface MenuItemService {

    List<MenuItemDto> getAllMenuItems();
}
