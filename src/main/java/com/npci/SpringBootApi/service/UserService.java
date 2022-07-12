package com.npci.SpringBootApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.SpringBootApi.model.User;
import com.npci.SpringBootApi.repository.UserRepository;
@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public void createUser(User user) {
        userRepo.save(user);
    }
	
	// public boolean findById(int userId) {
	     //   return userRepo.findById(userId).isPresent();
	  //  }
}
