package com.itz.MyRestjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itz.MyRestjwt.model.*;

public interface UserRepository extends JpaRepository<User,Long> {
	
	User findOneByUsername(String username);

}
