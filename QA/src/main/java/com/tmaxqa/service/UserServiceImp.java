package com.tmaxqa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tmaxqa.dao.UsersDao;
import com.tmaxqa.entity.Users;



@Service
@Transactional(rollbackFor = java.lang.Exception.class)
public class UserServiceImp implements UserService{
	
	@Autowired
	UsersDao dao;

	@Override
	public int addUser(Users user) {
		int result = dao.insertUser(user);
		return result;
	}

	@Override
	public int updateUserInfo(Users user) {
		int result = dao.updateUser(user);
		return result;
	}

	@Override
	public int outUser(String userId) {
		int result = dao.deleteUser(userId);
		return result;
	}


}
