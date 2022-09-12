package com.example.services;

import com.example.entities.User;

public interface UserServices {

	User registerUser(User user);
	User auth(String email, String password);
	
	
	
	
}
