package com.npci.SpringBootApi.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.npci.SpringBootApi.repository.UserRepository;
import com.npci.SpringBootApi.commonClass.APIResponse;
import com.npci.SpringBootApi.dto.RegisterRequest;
import com.npci.SpringBootApi.model.User;

public class LoginService {
	
	@Autowired
	private UserRepository userRepository;
	
	//public APIResponse register(RegisterRequest registerRequest) {
		 //APIResponse apiResponse = new APIResponse();
		 
		 //
		 User user=new User();
		 //user.setEmailId(RegisterRequest.getEmailId());

	}
//}
