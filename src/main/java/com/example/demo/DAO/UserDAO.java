package com.example.demo.DAO;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {

}
