package com.foodapp.developer.foodel.service.impl;

import com.foodapp.developer.foodel.dto.MenuItemDto;
import com.foodapp.developer.foodel.dto.UserDto;
import com.foodapp.developer.foodel.entity.MenuItem;
import com.foodapp.developer.foodel.entity.User;
import com.foodapp.developer.foodel.exception.ResourceNotFoundException;
import com.foodapp.developer.foodel.mapper.MenuItemMapper;
import com.foodapp.developer.foodel.mapper.UserMapper;
import com.foodapp.developer.foodel.repository.MenuItemRepository;
import com.foodapp.developer.foodel.repository.UserRepository;
import com.foodapp.developer.foodel.service.MenuItemService;
import com.foodapp.developer.foodel.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MenuServiceImpl implements MenuItemService {

    private MenuItemRepository menuItemRepository;

    @Override
    public List<MenuItemDto> getAllMenuItems() {
        List<MenuItem> menu=menuItemRepository.findAll();
        return menu.stream().map((menuItem1) -> MenuItemMapper.mapToMenuItemDto(menuItem1))
                .collect(Collectors.toList());
    }
}
