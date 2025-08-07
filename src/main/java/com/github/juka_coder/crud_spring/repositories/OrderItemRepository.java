package com.github.juka_coder.crud_spring.repositories;

import com.github.juka_coder.crud_spring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
