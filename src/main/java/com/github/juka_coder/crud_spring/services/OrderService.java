package com.github.juka_coder.crud_spring.services;


import com.github.juka_coder.crud_spring.entities.Order;
import com.github.juka_coder.crud_spring.entities.User;
import com.github.juka_coder.crud_spring.repositories.OrderRepository;
import com.github.juka_coder.crud_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();

    }
    public Order findById(Long id){
        Optional<Order> obj =  orderRepository.findById(id);
        return obj.get();
    }

}
