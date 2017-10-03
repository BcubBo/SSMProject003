package com.bcubbo.service;

import java.util.List;

import com.bcubbo.pojo.User;

public interface UserService {
	
	public List<User> getUserList();
	
	public User getUser(User user);
	
	public int insertUser(User user);
	
	
	public int deleteUser(User user);
	
	public int updateUser(User user);

}
