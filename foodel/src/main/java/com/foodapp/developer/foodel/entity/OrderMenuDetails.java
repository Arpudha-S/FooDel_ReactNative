package com.foodapp.developer.foodel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ordermenudetails")

public class OrderMenuDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;

    @Column(name="orderId")
    private Long orderId;

    @Column(name="price")
    private Long price;
    @Column(name="dishId")
    private String dishId;

    @Column(name="quantity")
    private Long quantity;
}
