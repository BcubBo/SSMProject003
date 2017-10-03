package com.bcubbo.dao;

import java.util.List;

import com.bcubbo.pojo.User;

public interface UserMapper {
	
	
	public List<User> getUserList();
	
	public User getUser(User user);
	
	public int insertUser(User user);
	
	
	public int deleteUser(User user);
	
	public int updateUser(User user);
	
	

}
