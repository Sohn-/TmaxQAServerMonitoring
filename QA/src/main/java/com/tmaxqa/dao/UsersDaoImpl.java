package com.tmaxqa.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tmaxqa.entity.Users;

@Repository
public class UsersDaoImpl implements UsersDao{
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	private final String nameSpace = "tmaxqa.mappers.UsersMapper.";

	@Override
	public int insertUser(Users user) {//회원가입
		String stmt = nameSpace + "insertUser";
		return sqlSession.insert(stmt, user);
	}

	@Override
	public int updateUser(Users user) {//회원정보수정
		String stmt = nameSpace + "updateUser";
		return sqlSession.update(stmt, user);
	}

	@Override
	public int deleteUser(String id) {//회원탈퇴
		String stmt = nameSpace + "deleteUser";
		return sqlSession.delete(stmt, id);
	}

	@Override
	public Users getUsersByUserId(String id) {//아이디중복체크
		String stmt = nameSpace + "getUsersByUserId";
		Users result = sqlSession.selectOne(stmt,id);
		return result;
		
	}

	

	

}
