package com.bcubbo.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bcubbo.dao.UserMapper;
import com.bcubbo.pojo.User;
import com.bcubbo.service.UserService;
@Service
public class UserSerivceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;
	
	@Override
	public List<User> getUserList() {
		
		return userMapper.getUserList();
	}

	@Override
	public User getUser(User user) {
		
		return userMapper.getUser(user);
	}

	@Override
	public int insertUser(User user) {
		
		return userMapper.insertUser(user);
	}

	@Override
	public int deleteUser(User user) {
		
		return userMapper.deleteUser(user);
	}

	@Override
	public int updateUser(User user) {
		
		return userMapper.updateUser(user);
	}

}
