package com.foodapp.developer.foodel.mapper;

import com.foodapp.developer.foodel.dto.MenuItemDto;
import com.foodapp.developer.foodel.dto.UserDto;
import com.foodapp.developer.foodel.entity.MenuItem;
import com.foodapp.developer.foodel.entity.User;

public class MenuItemMapper {
    public static MenuItemDto mapToMenuItemDto(MenuItem menu){
        return new MenuItemDto(
                menu.getId(),
                menu.getName(),
                menu.getImage(),
                menu.getPrice(),
                menu.getDishId()
        );
    }

    public static MenuItem mapToMenuItem(MenuItemDto menuItemDto){
        return new MenuItem(
                menuItemDto.getId(),
                menuItemDto.getName(),
                menuItemDto.getImage(),
                menuItemDto.getPrice(),
                menuItemDto.getDishId()
        );
    }
}
