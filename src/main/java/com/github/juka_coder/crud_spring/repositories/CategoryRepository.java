package com.github.juka_coder.crud_spring.repositories;

import com.github.juka_coder.crud_spring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
