package com.npci.SpringBootApi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.npci.SpringBootApi.commonClass.APIResponse;
import com.npci.SpringBootApi.model.User;
import com.npci.SpringBootApi.service.UserService;
@RestController
//@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="api/user", method=RequestMethod.POST)
	public ResponseEntity<APIResponse> createUser(@RequestBody User user) {
	    userService.createUser(user);
        return new ResponseEntity<>(new APIResponse(true, "a new user created"), HttpStatus.CREATED);
    }
}
