package com.github.juka_coder.crud_spring.services;


import com.github.juka_coder.crud_spring.entities.Category;
import com.github.juka_coder.crud_spring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();

    }
    public Category findById(Long id){
        Optional<Category> obj =  categoryRepository.findById(id);
        return obj.get();
    }

}
