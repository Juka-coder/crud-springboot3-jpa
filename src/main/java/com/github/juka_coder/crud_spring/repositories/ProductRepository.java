package com.github.juka_coder.crud_spring.repositories;

import com.github.juka_coder.crud_spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
