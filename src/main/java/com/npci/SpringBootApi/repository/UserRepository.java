package com.npci.SpringBootApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npci.SpringBootApi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	
}
