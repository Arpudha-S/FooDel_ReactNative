package com.foodapp.developer.foodel.repository;

import com.foodapp.developer.foodel.entity.OrderDetails;
import com.foodapp.developer.foodel.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetails, Long>{

}