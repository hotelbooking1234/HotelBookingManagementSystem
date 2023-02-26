package com.cg.hbm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.hbm.dto.UserDTO;
import com.cg.hbm.entity.User;

import com.cg.hbm.exception.InvalidUserException;
import com.cg.hbm.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	IUserRepository userRepository;

	
	@Override
	public User registerUser(User user)throws InvalidUserException {
	
		if(user.getFirstName().equals("") || user.getLastName().equals("")) {
			throw new InvalidUserException("User name","First Name or Last Name is null");
		}
		
		if(user.getEmailId().equals("")) {
			throw new InvalidUserException("Email Id","Email Id cannot be null");
		}
		if(user.getPassword().equals("")) {
			throw new InvalidUserException("Password","Password cannot be null");
		}
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {

		return userRepository.findAll();
	}

	
	
	
	

	

	@Override
	public User getUserById(int userId) {
		
		User userFromDB = userRepository.getReferenceById(userId);
		userRepository.getReferenceById(userId);
	
		return userFromDB;
	}

	@Override
	public User updateUser(int userId) {
	
		User updatedUser = userRepository.getReferenceById(userId);
		userRepository.save(updatedUser);
		return updatedUser;
	}

	

}
