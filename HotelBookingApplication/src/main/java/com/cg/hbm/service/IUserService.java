package com.cg.hbm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hbm.entity.User;


@Service
public interface IUserService {
	
	public User registerUser(User user)throws Exception;
	public List<User> getAllUsers();
	public User getUserById(int userId);
	public User updateUser(int userId);
	

}