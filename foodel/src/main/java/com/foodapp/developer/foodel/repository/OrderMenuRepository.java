package com.foodapp.developer.foodel.repository;

import com.foodapp.developer.foodel.entity.OrderDetails;
import com.foodapp.developer.foodel.entity.OrderMenuDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMenuRepository extends JpaRepository<OrderMenuDetails, Long>{

}