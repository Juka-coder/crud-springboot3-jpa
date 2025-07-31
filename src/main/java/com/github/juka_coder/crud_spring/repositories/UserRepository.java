package com.github.juka_coder.crud_spring.repositories;

import com.github.juka_coder.crud_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long>{

}
