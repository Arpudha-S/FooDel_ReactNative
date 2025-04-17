package com.foodapp.developer.foodel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="orderdetails")

public class OrderDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long orderId;

    @Column(name="custId")
    private Long custId;

    @Column(name="address")
    private String address;

    @Column(name="phoneNo")
    private String phoneNo;

    @Column(name="orderDate")
    private Date orderDate;
}
