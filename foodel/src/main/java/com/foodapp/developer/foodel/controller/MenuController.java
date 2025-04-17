package com.foodapp.developer.foodel.controller;

import com.foodapp.developer.foodel.dto.MenuItemDto;
import com.foodapp.developer.foodel.dto.UserDto;
import com.foodapp.developer.foodel.service.MenuItemService;
import com.foodapp.developer.foodel.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
@RestController
@RequestMapping("/api/menu")
public class MenuController {
    private MenuItemService menuItemService;

    @GetMapping
    public ResponseEntity<List<MenuItemDto>> getAllMenuItems(){
        List<MenuItemDto> menu=menuItemService.getAllMenuItems();
        return ResponseEntity.ok(menu);
    }

}
