package com.github.juka_coder.crud_spring.services;


import com.github.juka_coder.crud_spring.entities.Product;
import com.github.juka_coder.crud_spring.entities.User;
import com.github.juka_coder.crud_spring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public Product findById(Long id){
        Optional<Product> obj =  productRepository.findById(id);
        return obj.get();
    }

}
