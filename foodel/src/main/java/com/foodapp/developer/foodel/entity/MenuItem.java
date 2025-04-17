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
@Table(name="menu")
public class MenuItem {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="Name")
    private String Name;
    @Column(name="image")
    private String image;
    @Column(name="price")
    private Long price;
    @Column(name="dishId")
    private String dishId;
}