package com.backend.fullstackdemo.repository;

import com.backend.fullstackdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{

}
