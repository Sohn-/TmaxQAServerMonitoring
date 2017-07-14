package com.tmaxqa.service;


import com.tmaxqa.entity.Users;

public interface UserService {
	
	int addUser(Users user);//회원가입
	int updateUserInfo(Users user);//회원정보수정
	int outUser(String userId);//회원탈퇴

}
