package com.login.services;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.login.entities.User;
import com.login.repositories.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		User user = userRepository.findByEmail(username);
		if(user==null) {
		throw new UsernameNotFoundException("User not found for email"+ username);
		
	}
		return new org.springframework.security.core.userdetails.User(user. getEmail(), user.getPassword(),
				user.getRoles());
		
		return null;
	}
}
