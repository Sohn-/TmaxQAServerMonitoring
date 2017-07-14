package com.tmaxqa.dao;

import com.tmaxqa.entity.Users;



public interface UsersDao {
	
	int insertUser(Users user);
	int updateUser(Users user);
	int deleteUser(String id);
	
	Users getUsersByUserId(String id); //회원가입시 중복체크용

}
