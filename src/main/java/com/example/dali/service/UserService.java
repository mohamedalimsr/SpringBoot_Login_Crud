package com.example.dali.service;
import com.example.dali.UserRegistrationDto;
import com.example.dali.modelo.User;

import org.springframework.security.core.userdetails.UserDetailsService;



public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
